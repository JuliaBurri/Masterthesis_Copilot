<script lang="ts">
    import Task from "$lib/components/Task.svelte";

    export let data;
    $: tasks = data.tasks;
    $: priorities = data.priorities;

    $: priority = undefined;

    async function addTask() {
        // TODO: User Story 1 - Call api to add task
        console.log("Add Task")
    }

    async function schedule() {
        // TODO: User Story 3 - Call api to get schedule
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
        <!-- TODO: User Story 1 - Add input fields for title, description, duration -->
        <select bind:value={priority}>
            <option value="" disabled selected>Select task priority</option>
            {#each priorities as p}
                <option value={p}>
                    {p}
                </option>
            {/each}
        </select>
        <button style="margin: 12px 0" on:click={addTask}>{"Add task"}</button>
    </div>
</div>

<style>
    .container {
        display: grid;
        /* TODO: User Story 1 - this grid should be responsive */
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
        display: flex;
        flex-direction: column;
        gap: 12px;
    }

    button {
        background-color: whitesmoke;
        border: solid 1px #3A4D39;
        border-radius: 4px;
        padding: 8px;
        color: #739072;
        font-size: 14px;
        cursor: pointer;
        text-transform: uppercase;
    }

    select {
        padding: 8px;
        border-radius: 4px;
        border: none;
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
