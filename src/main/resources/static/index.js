window.onload = function () {
    const xhr = new XMLHttpRequest();
    xhr.onload = function () {

        if (xhr.status === 200){

            const exercises = JSON.parse(xhr.responseText)
            console.log(exercises)
            // let titleFromJson = exercises[0].name

            const bodyElement = document.querySelector("body")
            const mainElement = document.querySelector("main")


            exercises.forEach((exercise) => {

                const article = document.createElement("article")
                const img = document.createElement("img")
                const title = document.createElement("h1")
                const bodyPart = document.createElement("p")
                const targetMuscle = document.createElement("p")
                const equipment = document.createElement("p")
                const imgDiv = document.createElement("div")


                article.classList.add("exercise-article");
                img
                title.classList.add("exercise-title");
                bodyPart.classList.add("exercise-info");
                targetMuscle.classList.add("exercise-info");
                equipment.classList.add("exercise-info");
                imgDiv.classList.add("imgContainer")

                mainElement.append(article)
                imgDiv.append(img)
                article.append(imgDiv)
                article.append(title)
                article.append(bodyPart)
                article.append(targetMuscle)
                article.append(equipment)




                img.src = exercise.gifUrl;
                title.textContent = exercise.name;
                bodyPart.textContent = "Body Part: " + exercise.bodyPart;
                targetMuscle.textContent = "Targeted Muscle: " + exercise.target;
                equipment.textContent = "Equipment: " + exercise.equipment;
            });



        }

    }

    xhr.open("GET", "/api/exercise/get-all-exercises");
    xhr.send();
}