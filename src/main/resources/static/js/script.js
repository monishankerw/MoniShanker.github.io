document.addEventListener("DOMContentLoaded", () => {
  // Fetch data from local API (Spring Boot backend)
  fetch("http://localhost:8080/projects")
    .then(response => response.json())
    .then(data => {
      console.log("Fetched local project data: ", data);
      const projectSection = document.querySelector("#projects");
      if (!projectSection) {
        console.error("No #projects section found in the HTML.");
        return;
      }
      data.forEach(project => {
        const projectDiv = document.createElement("div");
        projectDiv.classList.add("project");
        projectDiv.innerHTML = `<h4>${project.name}</h4><p>${project.description}</p>`;
        projectSection.appendChild(projectDiv);
      });
    })
    .catch(error => console.error("Error fetching project data from local API: ", error));

  // Fetch data from external API (example)
  fetch("https://api.example.com/projects")
    .then(response => response.json())
    .then(data => {
      console.log("Fetched external project data: ", data);
      // Assuming we want to populate a different section with external data
      const externalSection = document.querySelector("#external-projects");
      if (!externalSection) {
        console.warn("No #external-projects section found in the HTML.");
        return;
      }
      data.forEach(project => {
        const externalDiv = document.createElement("div");
        externalDiv.classList.add("external-project");
        externalDiv.innerHTML = `<h4>${project.name}</h4><p>${project.description}</p>`;
        externalSection.appendChild(externalDiv);
      });
    })
    .catch(error => console.error("Error fetching project data from external API: ", error));
});