package com.board.web.dao.entity;

public class Paging {
	
	private int startPage;
	private int endPage;
	private int tempEndPage;
	private int total;
	private int nowPage;
	private int countPage = 10;
	private int pageNum = 5;
	
	
	public Paging() {
		// TODO Auto-generated constructor stub
		
	}
	
	public int getTotal() {
		return total;
		
	}

	public void setTotal(int total) {
		this.total = total;
		
		calcPaging();
		
	}

	private void calcPaging() {
		// TODO Auto-generated method stub
		//보여지는 마지막 페이지
		endPage = ((int)(Math.ceil(nowPage/(double)pageNum))*pageNum);
		
		//보여지는 시작페이지
		startPage = (endPage - pageNum) + 1;

		tempEndPage = ((int)Math.ceil(total/(double)countPage));
		
		if(endPage > tempEndPage) {
			endPage = tempEndPage;
		}
		
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public int getTempEndPage() {
		return tempEndPage;
	}

	public void setTempEndPage(int tempEndPage) {
		this.tempEndPage = tempEndPage;
	}


	public int getNowPage() {
		return nowPage;
	}

	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
		
	}

	public int getCountPage() {
		return countPage;
	}

	public void setCountPage(int countPage) {
		this.countPage = countPage;
	}

	public Paging(int startPage, int endPage, int tempEndPage, int total, int nowPage, int countPage) {
		this.startPage = startPage;
		this.endPage = endPage;
		this.tempEndPage = tempEndPage;
		this.total = total;
		this.nowPage = nowPage;
		this.countPage = countPage;
	}


	@Override
	public String toString() {
		return "Paging [startPage=" + startPage + ", endPage=" + endPage + ", tempEndPage=" + tempEndPage + ", total="
				+ total + ", nowPage=" + nowPage + ", countPage=" + countPage + "]";
	}

	
	

}
