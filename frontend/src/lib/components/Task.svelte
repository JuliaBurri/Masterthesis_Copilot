<script lang="ts">

    import type {Task} from "$lib/types/Task";

    export let task: Task;

    function checkTask(task: Task) {
        // TODO: User Story 2 - Call API so mark task as done
        console.log("Task checked: " + task.title);
    }
</script>

<div class="task-wrapper">
    <div class="row">
        <input type="checkbox" checked={task.done} on:change={() => checkTask(task)}/>
        <h3>{task.title}</h3>
    </div>

    <p style="text-align: left">{task.description}</p>

    <div>
        <p>{"Priority " + task.prio}</p>
        <p>{task.duration + " min"}</p>
    </div>
</div>

<style>
    .task-wrapper {
        border: solid 2px #739072;
        display: grid;
        grid-template-columns: 2fr 1fr 1fr;
        align-items: center;
        padding: 12px 24px;
        border-radius: 8px;
        background-color: white;
    }

    .row {
        display: flex;
        align-items: center;
        gap: 12px;
    }

    h3 {
        font-size: 18px;
        line-height: 24px;
        margin: 8px 0;
    }

    p {
        font-size: 14px;
        line-height: 14px;
        margin: 0;
        text-align: right;
    }
</style>

