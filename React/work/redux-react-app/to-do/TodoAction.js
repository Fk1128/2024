
export const addTODO = (id,text) => ({
    type : 'ADD_TODO',
    id,
    text
})


export const removeTODO = (id) => ({
    type : 'REMOVE_TODO',
    id,
    
})