package q90;

import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.security.MessageDigest;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class n0 {

    @NotNull
    public static final m0 Companion = new m0();

    @NotNull
    public static final n0 EMPTY;

    static {
        ia0.j jVar = ia0.j.f23646d;
        jVar.getClass();
        EMPTY = new j0(null, jVar);
    }

    @NotNull
    public static final n0 create(@NotNull ia0.a0 a0Var, @NotNull ia0.m mVar, @Nullable z zVar) {
        Companion.getClass();
        a0Var.getClass();
        mVar.getClass();
        return new i0(a0Var, mVar, zVar);
    }

    public long contentLength() {
        return -1L;
    }

    public abstract z contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    @NotNull
    public final ia0.j sha256() throws IOException {
        ia0.s sVar = new ia0.s(new ia0.e());
        ia0.c0 c0Var = new ia0.c0(sVar);
        try {
            writeTo(c0Var);
            c0Var.close();
            MessageDigest messageDigest = sVar.f23676b;
            messageDigest.getClass();
            byte[] bArrDigest = messageDigest.digest();
            bArrDigest.getClass();
            return new ia0.j(bArrDigest);
        } finally {
        }
    }

    public abstract void writeTo(ia0.h hVar);

    @NotNull
    public static final n0 create(@NotNull FileDescriptor fileDescriptor, @Nullable z zVar) {
        Companion.getClass();
        fileDescriptor.getClass();
        return new k0(fileDescriptor, zVar);
    }

    @NotNull
    public static final n0 create(@NotNull String str, @Nullable z zVar) {
        Companion.getClass();
        return m0.a(str, zVar);
    }

    @u70.d
    @NotNull
    public static final n0 create(@Nullable z zVar, @NotNull ia0.j jVar) {
        Companion.getClass();
        jVar.getClass();
        return new j0(zVar, jVar);
    }

    @u70.d
    @NotNull
    public static final n0 create(@Nullable z zVar, @NotNull File file) {
        Companion.getClass();
        file.getClass();
        return new h0(zVar, file);
    }

    @u70.d
    @NotNull
    public static final n0 create(@Nullable z zVar, @NotNull String str) {
        Companion.getClass();
        str.getClass();
        return m0.a(str, zVar);
    }

    @u70.d
    @NotNull
    public static final n0 create(@Nullable z zVar, @NotNull byte[] bArr) {
        Companion.getClass();
        bArr.getClass();
        return m0.b(zVar, bArr, 0, bArr.length);
    }

    @u70.d
    @NotNull
    public static final n0 create(@Nullable z zVar, @NotNull byte[] bArr, int i11) {
        Companion.getClass();
        bArr.getClass();
        return m0.b(zVar, bArr, i11, bArr.length);
    }

    @NotNull
    public static final n0 create(@NotNull byte[] bArr) {
        m0 m0Var = Companion;
        m0Var.getClass();
        bArr.getClass();
        return m0.c(m0Var, bArr, null, 0, 7);
    }

    @NotNull
    public static final n0 create(@NotNull byte[] bArr, @Nullable z zVar) {
        m0 m0Var = Companion;
        m0Var.getClass();
        bArr.getClass();
        return m0.c(m0Var, bArr, zVar, 0, 6);
    }

    @NotNull
    public static final n0 create(@NotNull byte[] bArr, @Nullable z zVar, int i11) {
        m0 m0Var = Companion;
        m0Var.getClass();
        bArr.getClass();
        return m0.c(m0Var, bArr, zVar, i11, 4);
    }

    @NotNull
    public static final n0 create(@NotNull byte[] bArr, @Nullable z zVar, int i11, int i12) {
        Companion.getClass();
        return m0.b(zVar, bArr, i11, i12);
    }

    @NotNull
    public static final n0 create(@NotNull ia0.j jVar, @Nullable z zVar) {
        Companion.getClass();
        jVar.getClass();
        return new j0(zVar, jVar);
    }

    @NotNull
    public static final n0 create(@NotNull File file, @Nullable z zVar) {
        Companion.getClass();
        file.getClass();
        return new h0(zVar, file);
    }

    @u70.d
    @NotNull
    public static final n0 create(@Nullable z zVar, @NotNull byte[] bArr, int i11, int i12) {
        Companion.getClass();
        bArr.getClass();
        return m0.b(zVar, bArr, i11, i12);
    }
}
