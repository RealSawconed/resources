/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */

function validation(form) {
    
    let name = form.name.value;
    let gender = form.genders.value;
    let bod = form.bod.value;
    let email = form.email.value;
    let address = form.address.value;
    // Get a list of only checked checkboxes
    let hobbies = document.querySelectorAll('input[name="hobbies"]:checked');
    // Append each checked checkboxes into a list
    let hobbiesList = [];
    hobbies.forEach((checkbox) => {
        hobbiesList.push(checkbox.value);
    });

    // Check name input with maximum of 50 characters
    if (name.length > 50) {
        alert("Name must be less than 50 characters!");
        return false;
    }
    
    // Check if Birthdate is valid
    let givenDate = new Date(bod);
    let currentDate = new Date();
    if (givenDate > currentDate) {
        alert("The Birthdate must not from the future!");
        return false;
    }

    // Check blank input for all prompt
    if (!name || !gender || !bod || !email || !address || hobbiesList.length === 0) {
        alert("Please fill in all the field!");
        return false;
    }

    return true;
}