// Add CSS Overflow Scroll to the Main Screen tables when the table height
// is greater than 176px

function updateTableOverflow() {
    let tableContainer = document.getElementsByClassName('inventory-table');
    let tableHeight = tableContainer.offsetHeight;

    if (tableHeight > 176) {
        tableContainer.style.overflowY = 'scroll';
    }
}

// Use for Sign Up and Forgot Password dummy links on Login.html
function displayAlert() {
    alert("This button doesn't work because it isn't a real website. It's just for school.");
}

// Change font color of name and inventory to red when a product inventory amount reaches 0
function noInventory() {
    let itemInventory = document.getElementsByClassName('item-inventory');
    for (let i = 0; i < itemInventory.length; i++) {
        let inventory = parseInt(itemInventory[i].innerText.trim());
        let itemName = itemInventory[i].parentNode.querySelector('.item-name');
        if (inventory === 0) {
            itemName.style.color = "red";
            itemInventory[i].style.color= "red";
        }
    }
}


window.onload = function() {
    noInventory();
    updateTableOverflow();
};


