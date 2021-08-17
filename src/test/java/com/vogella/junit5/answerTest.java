package com.vogella.junit5;

@Test
public final void answerTest() {
    // with doAnswer():
    doAnswer(returnsFirstArg()).when(list).add(anyString());
    // with thenAnswer():
    when(list.add(anyString())).thenAnswer(returnsFirstArg());
    // with then() alias:
    when(list.add(anyString())).then(returnsFirstArg());
}
