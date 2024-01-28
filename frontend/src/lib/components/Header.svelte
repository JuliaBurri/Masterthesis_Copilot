<script lang="ts">
    import {onMount} from "svelte";

    let currentDateTime = new Date();

    onMount(() => {
        const interval = setInterval(() => {
            currentDateTime = new Date();
        }, 1000);

        return () => {
            clearInterval(interval);
        };
    });

    function getWeekDay(c: Date) {
        let daysList = [
            "Sunday",
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday"
        ];
        return daysList[c.getDay()];
    }

    function getMonth(c: Date) {
        let monthsList = [
            "January",
            "February",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "October",
            "November",
            "December"
        ];
        return monthsList[c.getMonth()];
    }

    function getDate(c: Date) {
        return c.getDate();
    }

    function getHour(c: Date) {
        return c.getHours() ;
    }

    function getMinute(c: Date) {
        return c.getMinutes() < 10 ? "0" + c.getMinutes() : c.getMinutes();
    }



</script>

<header>
    <div class="date-time">
        <h2 class="date">{getWeekDay(currentDateTime)}, {getMonth(currentDateTime)} {getDate(currentDateTime)}</h2>
        <h2 class="time">{getHour(currentDateTime)}:{getMinute(currentDateTime)}</h2>
    </div>
</header>

<style>
    header {
        height: 96px;
        display: flex;
        justify-content: space-between;
        padding: 8px 24px;
        border-radius: 0 0 12px 12px;
        background-color: #ECE3CE;
    }

    .date-time {
        width: 100%;
        display: flex;
        gap: 24px;
        align-items: center;
        justify-content: space-between;
        color: #3A4D39;
        font-size: 16px;
        padding: 24px;
    }
</style>
