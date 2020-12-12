$(document).ready(function () {
    $('.table .editButton').on('click', function (event) {
        event.preventDefault();
        var href = $(this).attr('href');

        $.get(href, function (sail, status) {
            $('#idUpdate').val(sail.id);
            $('#modelUpdate').val(sail.model);
            $('#markUpdate').val(sail.mark);
            $('#updatedByUpdate').val(sail.updatedBy);
            $('#updatedOnUpdate').val(sail.updatedOn);
        });
        $('#editModal').modal();
    });

    $('.table .deleteButton').on('click', function (event) {
        event.preventDefault();
        var href = $(this).attr('href');
        $('#deleteModal #idDelete').attr('href', href);
        $('#deleteModal').modal();
    });

});
