<script lang="ts">
    import Task from "$lib/components/Task.svelte";

    export let data;
    $: tasks = data.tasks

    async function schedule() {
        // TODO: Call api to get schedule
        console.log("Schedule Work Day")
    }
</script>

<button on:click={schedule}>Schedule Work Day</button>
<div class="container">
    <div class="list">
        <h1>Todays Tasks</h1>
        {#each tasks as task}
            <Task {task}/>
        {/each}

        <h1>Tomorrows Tasks</h1>
        <p>Hint: Tasks that don't fit inside todays schedule should be displayed here.</p>

    </div>
    <div class="add-task-container">
        <h1>Add a new Task</h1>
        <!-- TODO: add input fields -->
        <p>tba</p>

        <button style="margin: 12px 0">{"Add task"}</button>
    </div>
</div>

<style>
    .container {
        /* TODO: This should be respsonsive */
        display: grid;
        grid-template-columns: 2fr 1fr;
        gap: 24px;
    }

    .list {
        display: flex;
        flex-direction: column;
        gap: 12px;
        padding: 24px;
        margin: 24px 0;
        border-radius: 8px;
        overflow-y: scroll;
        background-color: #3A4D39;
    }

    .add-task-container {
        background-color: #739072;
        padding: 24px;
        margin: 24px 0;
        border-radius: 8px;
    }

    button {
        background-color: whitesmoke;
        border: solid 1px #3A4D39;
        border-radius: 4px;
        padding: 8px;
        color: #739072;
        font-size: 14px;
        cursor: pointer;
    }

    h1 {
        width: 100%;
        color: whitesmoke;
    }

    p {
        color: whitesmoke;
        margin: 0;
        font-size: 12px;
    }
</style>
