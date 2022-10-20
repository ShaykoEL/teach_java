package by.step.teach_java.classwork.classwork_061022;

public interface HasPopUpBlock {
    PopUpBlock getPopUpBlock();
    default void verifyPopUpBlock() {
    //    if (getPopUpBlock())
    }
}
