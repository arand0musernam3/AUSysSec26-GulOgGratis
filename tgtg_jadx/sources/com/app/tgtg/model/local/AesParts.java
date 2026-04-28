package com.app.tgtg.model.local;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\r\u001a\u00020\u000eH\u0096\u0080\u0004J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/app/tgtg/model/local/AesParts;", "", "iv", "", "ciphertext", "<init>", "([B[B)V", "getIv", "()[B", "getCiphertext", "equals", "", "other", "hashCode", "", "component1", "component2", "copy", "toString", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class AesParts {
    public static final int $stable = 8;

    @NotNull
    private final byte[] ciphertext;

    @NotNull
    private final byte[] iv;

    public AesParts(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        this.iv = bArr;
        this.ciphertext = bArr2;
    }

    public static /* synthetic */ AesParts copy$default(AesParts aesParts, byte[] bArr, byte[] bArr2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bArr = aesParts.iv;
        }
        if ((i11 & 2) != 0) {
            bArr2 = aesParts.ciphertext;
        }
        return aesParts.copy(bArr, bArr2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final byte[] getIv() {
        return this.iv;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final byte[] getCiphertext() {
        return this.ciphertext;
    }

    @NotNull
    public final AesParts copy(@NotNull byte[] iv2, @NotNull byte[] ciphertext) {
        iv2.getClass();
        ciphertext.getClass();
        return new AesParts(iv2, ciphertext);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(AesParts.class, other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        AesParts aesParts = (AesParts) other;
        return Arrays.equals(this.iv, aesParts.iv) && Arrays.equals(this.ciphertext, aesParts.ciphertext);
    }

    @NotNull
    public final byte[] getCiphertext() {
        return this.ciphertext;
    }

    @NotNull
    public final byte[] getIv() {
        return this.iv;
    }

    public int hashCode() {
        return Arrays.hashCode(this.ciphertext) + (Arrays.hashCode(this.iv) * 31);
    }

    @NotNull
    public String toString() {
        return a.d("AesParts(iv=", Arrays.toString(this.iv), ", ciphertext=", Arrays.toString(this.ciphertext), ")");
    }
}
