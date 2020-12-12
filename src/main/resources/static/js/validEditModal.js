// Validate Edit Sail
let editIdError;
let editModelError;
let editMarkError;
let editUpdatedByError;
let editUpdatedOnError;
$('#idEditMessage').hide();
$('#modelEditMessage').hide();
$('#markEditMessage').hide();
$('#updatedByEditMessage').hide();
$('#updatedOnEditMessage').hide();

function validateEditSail() {
    // id
    let idEditValue = $('#idUpdate').val();
    if (idEditValue.length === 0) {
        $('#idEditMessage').show();
        editIdError = true;
    } else {
        $('#idEditMessage').hide();
        editIdError = false;
    }
    // model
    let modelEditValue = $('#modelUpdate').val();
    if (modelEditValue.length === 0) {
        $('#modelEditMessage').show();
        editModelError = true;
    } else {
        $('#modelEditMessage').hide();
        editModelError = false;
    }
    // mark
    let markEditValue = $('#markUpdate').val();
    if (markEditValue.length === 0) {
        $('#markEditMessage').show();
        editMarkError = true;
    } else {
        $('#markEditMessage').hide();
        editMarkError = false;
    }
    // updated by
    let updatedByValue = $('#updatedByUpdate').val();
    if (updatedByValue.length === 0) {
        $('#updatedByEditMessage').show();
        editUpdatedByError = true;
    } else {
        $('#updatedByEditMessage').hide();
        editUpdatedByError = false;
    }
    // updated on (yyyy/MM/dd)
    let updatedOnValue = $('#updatedOnUpdate').val();
    if (updatedOnValue.length === 0) {
        $('#updatedOnEditMessage').show();
        editUpdatedOnError = true;
    } else if (!(isValidDate(updatedOnValue))) { // in validAddModal file
        $('#updatedOnEditMessage').html
        ("**should be date format: yyyy-mm-dd");
        $('#updatedOnEditMessage').css("color", "red");
        editUpdatedOnError = true;
    } else {
        $('#updatedOnMessage').hide();
        editUpdatedOnError = false;
    }

    return !(editIdError || editModelError || editMarkError || editUpdatedByError || editUpdatedOnError);

}

// Submit add Sail
$('#submitEdit').click(function () {
    return validateEditSail();
});
