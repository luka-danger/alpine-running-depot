function updateTableOverflow() {
    let tableContainer = document.getElementsByClassName('inventory-table');
    let tableHeight = tableContainer.offsetHeight;

    if (tableHeight > 176) {
        tableContainer.style.overflowY = 'scroll';
    }
}

function displayAlert() {
    alert("This button doesn't work because it isn't a real website. It's just for school.");
}
