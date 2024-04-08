package exp.toleyko.fileSystem.tools;

import exp.toleyko.fileSystem.elements.File;
import exp.toleyko.fileSystem.elements.Folder;
import org.junit.Assert;
import org.junit.Test;

public class BuilderTest {

    @Test
    public void buildPathTest1() {
        String names = "Test";

        Folder test = new Folder(names);

        Folder target = new Folder("");
        Builder.buildPath(names, target);

        Assert.assertEquals(test.getClass(), target.getElements().get("Test").getClass());
    }

    @Test
    public void buildPathTest2() {
        String names = "Test.txt";

        File test = new File(names);

        Folder target = new Folder("");
        Builder.buildPath(names, target);

        Assert.assertEquals(test.getClass(), target.getElements().get("Test.txt").getClass());
    }

    @Test
    public void buildPathTest3() {
        String names = "Test";

        Folder test = new Folder("Test");
        Builder.buildPath(names, test);

        Folder target = new Folder("");
        Builder.buildPath(names, target);
        Builder.buildPath(names, target);

        Assert.assertEquals(test.getElements().size(), target.getElements().size());
    }
}
