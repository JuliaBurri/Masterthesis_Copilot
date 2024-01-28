<script lang="ts">
    import Header from '$lib/components/Header.svelte';
</script>

<div class="app">
    <Header/>
    <main>
        <slot/>
    </main>
</div>

<style>

    :global(body) {
        width: 100%;
        min-height: 100%;
        background-color: #ECE3CE;
        margin: 0;
        font-family: -system-ui, -apple-system, BlinkMacSystemFont, sans-serif;
    }

    :global(main) {
        padding: 0 48px;
    }

    :global(::-webkit-scrollbar) {
        width: 8px;
    }

    :global(::-webkit-scrollbar-track) {
        box-shadow: inset 0 0 6px rgba(0, 0, 0, 0);
    }

    :global(::-webkit-scrollbar-thumb) {
        background-color: lightgrey;
        outline: none;
        border-radius: 10px;
    }
</style>
