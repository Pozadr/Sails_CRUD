// Validate Add Sail
let idError;
let modelError;
let markError;
let updatedByError;
let updatedOnError;
$('#idMessage').hide();
$('#modelMessage').hide();
$('#markMessage').hide();
$('#updatedByMessage').hide();
$('#updatedOnMessage').hide();

function validateAddSail() {
    // id
    let idAddValue = $('#idAdd').val();
    if (idAddValue.length === 0) {
        $('#idMessage').show();
        idError = true;
    } else {
        $('#idMessage').hide();
        idError = false;
    }
    // model
    let modelAddValue = $('#modelAdd').val();
    if (modelAddValue.length === 0) {
        $('#modelMessage').show();
        modelError = true;
    } else {
        $('#modelMessage').hide();
        modelError = false;
    }
    // mark
    let markAddValue = $('#markAdd').val();
    if (markAddValue.length === 0) {
        $('#markMessage').show();
        markError = true;
    } else {
        $('#markMessage').hide();
        markError = false;
    }
    // updated by
    let updatedByValue = $('#updatedByAdd').val();
    if (updatedByValue.length === 0) {
        $('#updatedByMessage').show();
        updatedByError = true;
    } else {
        $('#updatedByMessage').hide();
        updatedByError = false;
    }
    // updated on (yyyy/MM/dd)
    let updatedOnValue = $('#updatedOnAdd').val();
    if (updatedOnValue.length === 0) {
        $('#updatedOnMessage').show();
        updatedOnError = true;
    } else if (!(isValidDate(updatedOnValue))) {
        $('#updatedOnMessage').html
        ("**should be date format: yyyy-mm-dd");
        $('#updatedOnMessage').css("color", "red");
        updatedOnError = true;
    } else {
        $('#updatedOnMessage').hide();
        updatedOnError = false;
    }

    return !(idError || modelError || markError || updatedByError || updatedOnError);
}

// Submit add Sail
$('#submitAdd').click(function () {
    return validateAddSail();
});


// format yyyy-mm-dd.
function isValidDate(dateString) {
    // First check for the pattern
    var regex_date = /^\d{4}\-\d{1,2}\-\d{1,2}$/;

    if (!regex_date.test(dateString)) {
        return false;
    }

    // Parse the date parts to integers
    var parts = dateString.split("-");
    var day = parseInt(parts[2], 10);
    var month = parseInt(parts[1], 10);
    var year = parseInt(parts[0], 10);

    // Check the ranges of month and year
    if (year < 1000 || year > 3000 || month == 0 || month > 12) {
        return false;
    }

    var monthLength = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];

    // Adjust for leap years
    if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
        monthLength[1] = 29;
    }

    // Check the range of the day
    return day > 0 && day <= monthLength[month - 1];
}

