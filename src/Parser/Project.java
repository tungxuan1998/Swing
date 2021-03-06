package Parser;

import java.util.LinkedList;

/**
 * class Project represent a java project
 *
 * @author Vu Minh Hieu
 */
public class Project extends Directory {

    private final LinkedList<SourceFile> sourceFiles; // all source files in the project

    /**
     * Project Constructor
     *
     * @param path the path of a project
     */
    public Project(String path) {
        super(path);
        sourceFiles = new LinkedList<SourceFile>();

        for (String filePath : allSourceFilePaths)
            sourceFiles.add(new SourceFile(filePath));
    }

    /**
     * Return all source files
     *
     * @return a LinkedList contains all source files
     */
    public LinkedList<SourceFile> getSourceFiles() {
        return sourceFiles;
    }

    /**
     * Local testing
     */
    public static void main(String[] args) {
        Project uml;
        if (args.length != 0)
            uml = new Project(args[0]);
        else
            uml = new Project("E:\\Code\\OOP\\UML-Visualizer");

        /*try {
            FileWriter writer = new FileWriter("file1.txt", true);
            BufferedWriter out = new BufferedWriter(writer);

            for (SourceFile file : uml.sourceFiles) {
                out.append("*************************************************\n");
                out.append(file.getContainedClass() + "\n");
            }

            out.close();
        } catch(IOException e) {
            System.out.println(e);
        }*/
        for (SourceFile file : uml.sourceFiles) {
            System.out.println("********************************************");
            System.out.println(file.getContainedClass());
        }
    }
}
