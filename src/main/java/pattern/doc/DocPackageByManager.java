package pattern.doc;

public class DocPackageByManager implements DocPackage {

    @Override
    public DocPackage generateDocPackage() {
        return new DocPackageByManager();
    }
}
