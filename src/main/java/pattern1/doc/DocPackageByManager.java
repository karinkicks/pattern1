package pattern1.doc;

public class DocPackageByManager implements DocPackage {

    @Override
    public DocPackage generateDocPackage() {
        return new DocPackageByManager();
    }
}
