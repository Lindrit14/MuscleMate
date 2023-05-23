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
                const title = document.createElement("h1")
                const type = document.createElement("p")
                const muscle = document.createElement("p")
                const difficulty = document.createElement("p")


                article.classList.add("exercise-article");
                title.classList.add("exercise-title");
                type.classList.add("exercise-info");
                muscle.classList.add("exercise-info");
                difficulty.classList.add("exercise-info");

                mainElement.append(article)
                article.append(title)
                article.append(type)
                article.append(muscle)
                article.append(difficulty)




                title.textContent = exercise.name;
                type.textContent = "Type: " + exercise.type;
                muscle.textContent = "Muscle: " + exercise.muscle;
                difficulty.textContent = "Difficulty: " + exercise.difficulty;
            });



        }

    }

    xhr.open("GET", "/api/exercise");
    xhr.send();
}