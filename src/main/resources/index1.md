Here's an overview of common CSS properties and concepts that can be applied in a stylesheet. These examples will demonstrate various features such as styling text, layout, positioning, animations, and more.

### CSS Examples and Properties

```css
/* Global styles */
* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}

body {
    font-family: Arial, sans-serif;
    line-height: 1.6;
    color: #333;
    background-color: #f4f4f4;
}

/* Typography */
h1, h2, h3, h4, h5, h6 {
    font-weight: bold;
    color: #333;
}

p {
    font-size: 16px;
    margin: 10px 0;
}

strong {
    font-weight: bold;
}

em {
    font-style: italic;
}

mark {
    background-color: yellow;
    font-weight: bold;
}

/* Links */
a {
    color: blue;
    text-decoration: none;
}

a:hover {
    text-decoration: underline;
    color: darkblue;
}

/* Lists */
ul, ol {
    margin: 20px 0;
    padding-left: 20px;
}

li {
    margin-bottom: 5px;
}

/* Tables */
table {
    width: 100%;
    border-collapse: collapse;
    margin-bottom: 20px;
}

th, td {
    border: 1px solid #ddd;
    padding: 8px;
    text-align: left;
}

th {
    background-color: #f0f0f0;
    font-weight: bold;
}

/* Forms */
form {
    margin: 20px 0;
}

input, select, textarea {
    display: block;
    width: 100%;
    padding: 10px;
    margin-bottom: 10px;
    border: 1px solid #ccc;
    border-radius: 4px;
}

button {
    padding: 10px 20px;
    background-color: #5cb85c;
    color: white;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

button:hover {
    background-color: #4cae4c;
}

/* Layout */
header {
    background-color: #333;
    color: white;
    padding: 20px 0;
    text-align: center;
}

nav ul {
    display: flex;
    justify-content: center;
    list-style: none;
}

nav ul li {
    margin: 0 15px;
}

nav ul li a {
    color: white;
    font-weight: bold;
}

section {
    margin: 20px 0;
}

article {
    background-color: white;
    padding: 20px;
    border: 1px solid #ddd;
    margin-bottom: 20px;
}

footer {
    background-color: #333;
    color: white;
    padding: 10px;
    text-align: center;
}

/* Flexbox */
.flex-container {
    display: flex;
    justify-content: space-around;
    align-items: center;
}

.flex-item {
    background-color: #f0f0f0;
    padding: 20px;
    margin: 10px;
    border: 1px solid #ccc;
}

/* Grid Layout */
.grid-container {
    display: grid;
    grid-template-columns: repeat(3, 1fr);
    grid-gap: 10px;
}

.grid-item {
    background-color: #eaeaea;
    padding: 20px;
    border: 1px solid #ddd;
}

/* Positioning */
.relative-box {
    position: relative;
    width: 200px;
    height: 200px;
    background-color: #ccc;
}

.relative-box .absolute-box {
    position: absolute;
    top: 10px;
    left: 10px;
    width: 100px;
    height: 100px;
    background-color: #333;
    color: white;
    padding: 10px;
}

/* Animation */
@keyframes fadeIn {
    from {
        opacity: 0;
    }
    to {
        opacity: 1;
    }
}

.fade-in {
    animation: fadeIn 2s ease-in;
}

/* Transitions */
.transition-box {
    background-color: #333;
    color: white;
    padding: 20px;
    transition: background-color 0.3s ease;
}

.transition-box:hover {
    background-color: #555;
}

/* Media Queries for Responsiveness */
@media (max-width: 768px) {
    nav ul {
        flex-direction: column;
    }

    .grid-container {
        grid-template-columns: 1fr;
    }

    .flex-container {
        flex-direction: column;
    }
}
```

### Explanation of CSS Properties and Techniques

1. **Global Styles**
    - The universal selector (`*`) resets the default margin, padding, and sets `box-sizing: border-box` to make layout handling easier.

2. **Typography**
    - You can control font properties (`font-size`, `font-weight`, etc.) and text decoration.
    - Elements like `<p>`, `<strong>`, `<em>`, and `<mark>` are styled for emphasis, bold, italics, or highlight.

3. **Links**
    - By default, links (`<a>`) are styled with colors, and hover effects change their appearance.

4. **Lists**
    - CSS allows you to style unordered (`<ul>`), ordered (`<ol>`), and list items (`<li>`), including adding margins, padding, and different list styles.

5. **Tables**
    - Tables can be styled using `border`, `padding`, and other properties to create clear and readable table layouts.
  
6. **Forms**
    - Input fields, select dropdowns, and buttons are styled for consistency and usability, including focus and hover states for interactive elements.

7. **Layout**
    - Common layout elements like `<header>`, `<footer>`, and `<section>` are styled for better structure.
    - Flexbox and Grid are used for modern layout techniques.

8. **Flexbox**
    - Flexbox layout (`display: flex`) makes it easy to align items and distribute space along a container’s axis.

9. **Grid Layout**
    - Grid layout (`display: grid`) provides advanced layout features with precise control over rows and columns.

10. **Positioning**
    - Different positioning models (`relative`, `absolute`, `fixed`) are demonstrated with boxes, showing how elements can be positioned.

11. **Animations and Transitions**
    - Animations like `@keyframes` allow you to animate elements over time.
    - Transitions allow for smooth hover effects, like changing background colors.

12. **Responsive Design**
    - Media queries (`@media`) adjust styles based on screen width to create responsive designs that adapt to different devices (like mobile phones and tablets).

This set of CSS properties gives you a complete foundation for designing and styling modern web pages.