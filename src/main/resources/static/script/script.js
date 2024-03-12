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

function noInventory() {
    let productInventory = document.getElementsByClassName('product-inventory');
    for (let i = 0; i < productInventory.length; i++) {
        let inventory = parseInt(productInventory[i].innerText.trim());
        let productName = productInventory[i].parentNode.querySelector('.product-name');
        if (inventory === 0) {
            productName.style.color = "red";
            productInventory[i].style.color= "red";
        }
    }
}

window.onload = function() {
    noInventory();
    updateTableOverflow();
};


