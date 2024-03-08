function updateTableOverflow() {
    let tableContainer = document.getElementsByClassName('inventory-table');
    let tableHeight = tableContainer.offsetHeight;

    if (tableHeight > 176) {
        tableContainer.style.overflowY = 'scroll';
    }
}