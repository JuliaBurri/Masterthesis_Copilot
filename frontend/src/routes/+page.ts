import type {PageLoad} from './$types';

export const load = (async ({fetch}) => {
    const fetchTasks = async () => {
        const taskResponse = await fetch('http://localhost:8080/api/tasks');
        return await taskResponse.json();
    };


    return {
        tasks: await fetchTasks(),
    };
}) satisfies PageLoad;
