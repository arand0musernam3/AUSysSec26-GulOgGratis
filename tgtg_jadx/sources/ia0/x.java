package ia0;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class x extends w {
    public static Long L(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long lValueOf = Long.valueOf(millis);
        if (millis != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // ia0.w, ia0.m
    public final a40.x G(a0 a0Var) {
        a0 a0VarS;
        a0Var.getClass();
        Path path = Paths.get(a0Var.f23603a.s(), new String[0]);
        path.getClass();
        try {
            BasicFileAttributes attributes = Files.readAttributes(path, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(path) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            if (symbolicLink != null) {
                String str = a0.f23602b;
                a0VarS = n20.f.s(symbolicLink.toString());
            } else {
                a0VarS = null;
            }
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long L = fileTimeCreationTime != null ? L(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long L2 = fileTimeLastModifiedTime != null ? L(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new a40.x(zIsRegularFile, zIsDirectory, a0VarS, lValueOf, L, L2, fileTimeLastAccessTime != null ? L(fileTimeLastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // ia0.w, ia0.m
    public final void e(a0 a0Var, a0 a0Var2) throws IOException {
        a0Var.getClass();
        a0Var2.getClass();
        try {
            Path path = Paths.get(a0Var.f23603a.s(), new String[0]);
            path.getClass();
            Path path2 = Paths.get(a0Var2.f23603a.s(), new String[0]);
            path2.getClass();
            Files.move(path, path2, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            i4.a.k("atomic move not supported");
        } catch (NoSuchFileException e5) {
            throw new FileNotFoundException(e5.getMessage());
        }
    }

    @Override // ia0.w
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
