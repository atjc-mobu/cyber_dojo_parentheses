package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import cyber_dojo_parentheses.Main;

public class MainTest {
    
    @Test
    public void 文字数が0の場合true() {
        assertTrue(Main.isLengthZero(""));
    }
    @Test
    public void 文字数が0より大きい場合false() {
        assertFalse(Main.isLengthZero("[]"));
    }
    @Test
    public void 文字列に丸かっこペアが存在する場合true() {
        assertTrue(Main.existsKakkoPair("[()]"));
    }
    @Test
    public void 文字列に角かっこペアが存在する場合true() {
        assertTrue(Main.existsKakkoPair("([])"));
    }
    @Test
    public void 文字列にとげかっこペアが存在する場合true() {
        assertTrue(Main.existsKakkoPair("[{}]"));
    }
    @Test
    public void 文字列に丸角とげかっこペアがいずれも存在しない場合false() {
        assertFalse(Main.existsKakkoPair("[{]"));
    }
    @Test
    public void 文字列が丸かっこペアの場合空文字になる() {
        assertEquals("", Main.replacePairKakkoToEmpty("()"));
    }
    @Test
    public void 文字列が角かっこペアの場合空文字になる() {
        assertEquals("", Main.replacePairKakkoToEmpty("[]"));
    }
    @Test
    public void 文字列がとげかっこペアの場合空文字になる() {
        assertEquals("", Main.replacePairKakkoToEmpty("{}"));
    }
    @Test
    public void 文字列が丸角とげかっこペアの場合空文字になる() {
        assertEquals("", Main.replacePairKakkoToEmpty("(){}[]"));
    }
    @Test
    public void 空だったらtrue() {
        assertTrue(Main.judgePair(""));
    }
    @Test
    public void ペア1丸かっこ() {
        assertTrue(Main.judgePair("()"));
    }
    @Test
    public void ペア1角かっこ() {
        assertTrue(Main.judgePair("[]"));
    }
    @Test
    public void ペア1トゲかっこ() {
        assertTrue(Main.judgePair("{}"));
    }
    @Test
    public void 非ペア1() {
        assertFalse(Main.judgePair(")("));
    }
    @Test
    public void LEVEL1_ペア1_LEVEL2_ペア1() {
        assertTrue(Main.judgePair("([])"));
    }
    @Test
    public void LEVEL1_ペア1_LEVEL2_ペア複数() {
        assertTrue(Main.judgePair("([]{}())"));
    }
    @Test
    public void LEVEL1_ペア複数_LEVEL2_ペア複数() {
        assertTrue(Main.judgePair("([]{}()){}()"));
    }
}
