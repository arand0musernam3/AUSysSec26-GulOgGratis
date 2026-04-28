package k00;

import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m0 implements Comparator {
    public static final m0 zza;
    private static final /* synthetic */ m0[] zzb;

    static {
        m0 m0Var = new m0("INSTANCE", 0);
        zza = m0Var;
        zzb = new m0[]{m0Var};
    }

    public static m0[] values() {
        return (m0[]) zzb.clone();
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int iMin = Math.min(bArr.length, bArr2.length);
        for (int i11 = 0; i11 < iMin; i11++) {
            int i12 = (bArr[i11] & 255) - (bArr2[i11] & 255);
            if (i12 != 0) {
                return i12;
            }
        }
        return bArr.length - bArr2.length;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
    }
}
