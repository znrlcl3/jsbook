$(function () {
	
    $('#btnDelete').click(function () {
        $.ajax({
            type: "POST",
            url: "/board/detail/delete-data",
            data : {boardId:$('.board-id').text()},
            async: "true",
           
            datatype: "json",
            success: function (data) {
            	alert("삭제되었습니다.");
           		location.href="/board/list"
            }
        })
    });

});