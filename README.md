# D287 Final Project

Created by Nate Edge

Design inspired by Western Governor's University
Course D287 - Java Frameworks

# *Alpine Running* Store Inventory Spring Boot Application

**Tech Description:** This is a full-stack Spring Boot
Application with an HTML front-end and Java back-end. The application
stores data in an H2 SQL database engine.

**Application Description:** Alpine Running Depot is a fictitious, online 
trail running supply store. The website includes a main screen that allows a user to add,
delete, and update replacement parts and product inventory. It also includes an about page 
with a link to a sign up page, an about page for users that already have an account, a login 
page, and a Contact Us page. 

# Added Files:
Controllers:
<ul>
<li>About Controller</li>
<li>Contact Controller</li>
<li>Guest About Controller</li>
<li>Login Controller</li>
</ul>
Static:
<ul>
<li>Images Directory</li>
<li>Script Directory (w/ Script.js file)</li>
</ul>
Templates:
<ul>
<li>About.html</li>
<li>Contact.html</li>
<li>guestAbout.html</li>
<li>Login.html</li>
</ul>

# Code Changes:
Controllers:
<ul>
<li>About Controller</li>
<li>Contact Controller</li>
<li>Guest About Controller</li>
<li>Login Controller</li>
</ul>
The above controllers were added and use @Controller Annotation and @RequestMapping to 
provide active links to the html pages: about.html, contact.html, guestAbout.html, and login.html

Static/CSS:
<ul>
<li>Renamed Demo.css to Style.css</li>
<li>(Full Style Sheet) Restyled web pages: color, images, layout, design, color, 
and added images</li>
</ul>

Static/Images:
<ul>
<li>Added images directory</li>
<li>Added images to Main Screen (Inventory), About Pages, Contact Page, 
and Login Page</li>
</ul>

Static/Script:
<ul>
<li>Created a script directory to store newly created script.js JavaScript file</li>
<li>Created custom JavaScript Functions:</li>
<ul>
<li>updateTableOverflow(): This function prevents the tables from overflowing, or "spilling", 
out of the designated container (div) by adding a table overflow: scroll property to both
the product and the parts inventory tables on the main screen when the tables have a height 
greater than 176px (roughly 7 rows + a table head). These changes affect the mainscreen.html 
file and affect the tables on lines 59-80 and lines 99-125. </li>
<li>displayAlert(): This function displays an alert when the two dummy links "Forgot Password" 
and "Sign Up" are clicked on the login page. This alert informs the user that the links do not 
work, as this is not a real website. These changes affect the login.html file and affect the 
"Forgot Password" link on Line 37 and the "Sign Up" link on Line 44.</li>
</ul>
</ul>

Resources/Templates: 
<ul>
<li>Structural Changes to mainscreen.html:</li>
<ul>
<li><strong>This page can be accessed by searching 'http://localhost:8080' after running
the Spring Boot Application. It can also be reached by clicking the Test Drive button on 
Line 50 of login.html</strong></li>
<li>Link Stylesheet (style.css) on Line 11</li>
<li>Link JavaScript File (script.js) on Line 12</li>
<li>Add inline script to run updateTableOverflow() function on window loading on Line 13</li>
<li>Change title to Alpine Running on Line 17</li>
<li>Wrap body in container div on Line 21</li>
<li>Separate into left and right containers on Lines 22 and 32</li>
<li>Add a top and bottom container to left container for h1 and sub-header on 
Lines 23-29</li>
<li>Add header with href links to About, Contact Us, and Login pages on Lines 33 - 42</li>
<li>Wrap Replacement Parts section in a div called parts on Line 44</li>
<li>Wrap Add Item Links in a div Line 55 </li>
<li>Change "Add In-House Item" to "Add Replacement Item" on Line 56</li>
<li>Comment out the outsourced item link on Line 57</li>
<li>Wrap Replacement Item Inventory Table in a div called inventory-table on Line 59</li>
<li>This tables uses the custom JavaScript function updateTableOverflow()</li>
<li>Wrap Products section in a div called parts on Line 83</li>
<li>Wrap Add Product in a div Line 99</li>
<li>Wrap Product Inventory Table in a div called inventory-table on Line 102</li>
<li>This tables uses the custom JavaScript function updateTableOverflow()</li>
</ul>
</ul>

Added Templates:
All added templates can be accessed by use of the following created controllers: AboutController, 
ContactController, GuestAboutController, and LoginController.
<li>Added guestAbout.html:</li>
<ul>
<li>(Part D) This page describes the website to users and includes a stock photo, a header, and links 
to the Main Screen (called inventory), Login and Contact pages. This page does <strong>not</strong> include
a link to login.html</li>
<li><strong>This page can be reached by clicking the "About" Header on the mainscreen.</strong></li>
</ul>
<li>Added about.html:</li>
<ul>
<li>This page describes the website to users and includes a stock photo, a header, and links 
to the Login and Contact pages. This page <strong>does</strong> include
a link to login.html</li>
<li><strong>This page can be reached by clicking the "About" link in the header on the login.html page
or the "About" link in the header on the contact.html page.</strong></li>
</ul>
<li>Added contact.html:</li>
<ul>
<li>This page includes pretend contact information, a header containing links to about.html and login.html, 
and an image.</li>
<li><strong>This page can be reached by clicking the "Contact" link in the header on the mainscreen.html,
login.html, about.html, and guest.html pages.</strong></li>
</ul>
<li>Added login.html:</li>
<ul>
<li>This page includes a login screen, a Test Drive link to mainscreen.html, two dummy links that display
an alert using the custom displayAlert() JavaScript function, and a header with links to the about.html
and contact.html pages.</li>
<li><strong>This page can be reached by clicking the "Login" link in the header on the mainscreen.html,
contact.html, about.html, and guest.html pages.</strong></li>
</ul>

# Code Description (Rubric Requirements)
**C: Customize HTML user interface:** All details of changes can be found in the above 'Code Changes'
section.

**D: Add an About Page:** All details of about pages can be found in the above 'Code Changes' section.
The About page can also be accessed [here](http://localhost:8080/guestAbout). Code for the About page
can be accessed [here](src/main/resources/templates/guestAbout.html).

**E:**

# Images
The image used in contact.html on Line 45 is my own.
<br>
All other images are free, stock photos downloaded from Unsplash.com