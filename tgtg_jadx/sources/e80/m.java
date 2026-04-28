package e80;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.io.FileAlreadyExistsException;
import kotlin.io.FileSystemException;
import kotlin.io.FileWalkDirection;
import kotlin.io.NoSuchFileException;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class m extends l {
    public static void d(File file, File file2) throws IOException {
        if (!file.exists()) {
            throw new NoSuchFileException(file, null, "The source file doesn't exist.", 2, null);
        }
        if (file2.exists() && !file2.delete()) {
            throw new FileAlreadyExistsException(file, file2, "Tried to overwrite the destination, but failed to delete it.");
        }
        if (file.isDirectory()) {
            if (!file2.mkdirs()) {
                throw new FileSystemException(file, file2, "Failed to create target directory.");
            }
            return;
        }
        File parentFile = file2.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                pd.g.o(fileInputStream, fileOutputStream);
                fileOutputStream.close();
                fileInputStream.close();
            } finally {
            }
        } finally {
        }
    }

    public static boolean e(File file) {
        file.getClass();
        FileWalkDirection fileWalkDirection = FileWalkDirection.BOTTOM_UP;
        fileWalkDirection.getClass();
        g gVar = new g(new i(file, fileWalkDirection, null, null, null, 0, 32, null));
        while (true) {
            boolean z11 = true;
            while (gVar.hasNext()) {
                File file2 = (File) gVar.next();
                if (!file2.delete() && file2.exists()) {
                    z11 = false;
                } else {
                    if (z11) {
                        break;
                    }
                    z11 = false;
                }
            }
            return z11;
        }
    }

    public static String f(File file) {
        file.getClass();
        String name = file.getName();
        name.getClass();
        return StringsKt.W('.', name, "");
    }

    public static String g(File file) {
        file.getClass();
        String name = file.getName();
        name.getClass();
        return StringsKt.b0(name, ".");
    }

    public static File h(File file, String str) {
        int length;
        int iF;
        file.getClass();
        File file2 = new File(str);
        String path = file2.getPath();
        path.getClass();
        char c3 = File.separatorChar;
        int iF2 = StringsKt.F(path, c3, 0, false, 4);
        if (iF2 != 0) {
            length = (iF2 <= 0 || path.charAt(iF2 + (-1)) != ':') ? (iF2 == -1 && StringsKt.B(path, ':')) ? path.length() : 0 : iF2 + 1;
        } else if (path.length() <= 1 || path.charAt(1) != c3 || (iF = StringsKt.F(path, c3, 2, false, 4)) < 0) {
            length = 1;
        } else {
            int iF3 = StringsKt.F(path, c3, iF + 1, false, 4);
            length = iF3 >= 0 ? iF3 + 1 : path.length();
        }
        if (length > 0) {
            return file2;
        }
        String string = file.toString();
        string.getClass();
        if ((string.length() == 0) || StringsKt.B(string, c3)) {
            return new File(string + file2);
        }
        return new File(string + c3 + file2);
    }
}
