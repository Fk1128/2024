export const ADD_TODO = (id,text) => ({
    type: 'ADD',
    id,
    text
})

export const REMOVE_TODO  = (id) => ({
    type: 'REMOVE',
    id
})