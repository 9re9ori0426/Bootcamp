$(function () {

    function getJSON() {
        // document.querySelector("#btn").addEventListener("click", function() {
        //
        // })

        // jquery
        $("#btn").click(function () {
            const nameEl = document.querySelector("#name");
            const ageEl = document.querySelector("#age");

            $.ajax({
                // url: `humanc?name=${nameEl.value}age=${ageEl.value}`,
                url: `humanc`,
            }).done(function (reData) {
                console.log(reData);
            }).fail(function () {

            })
        })
    }
});
