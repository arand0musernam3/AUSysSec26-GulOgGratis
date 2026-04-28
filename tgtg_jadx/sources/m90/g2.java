package m90;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class g2 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g2 f29801a = new g2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i1 f29802b = new i1("kotlin.uuid.Uuid", k90.d.f26221r);

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        String strR = decoder.r();
        strR.getClass();
        int length = strR.length();
        int i11 = 0;
        if (length == 32) {
            long j9 = 0;
            while (i11 < 16) {
                long j11 = j9 << 4;
                char cCharAt = strR.charAt(i11);
                if ((cCharAt >>> '\b') == 0) {
                    long j12 = kotlin.text.d.f26598b[cCharAt];
                    if (j12 >= 0) {
                        j9 = j11 | j12;
                        i11++;
                    }
                }
                o30.f0.W(i11, strR, "a hexadecimal digit");
                throw null;
            }
            long j13 = 0;
            for (int i12 = 16; i12 < 32; i12++) {
                long j14 = j13 << 4;
                char cCharAt2 = strR.charAt(i12);
                if ((cCharAt2 >>> '\b') == 0) {
                    long j15 = kotlin.text.d.f26598b[cCharAt2];
                    if (j15 >= 0) {
                        j13 = j14 | j15;
                    }
                }
                o30.f0.W(i12, strR, "a hexadecimal digit");
                throw null;
            }
            if (j9 != 0 || j13 != 0) {
                return new q80.a(j9, j13);
            }
        } else {
            if (length != 36) {
                StringBuilder sb2 = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                sb2.append(strR.length() <= 64 ? strR : strR.substring(0, 64).concat("..."));
                sb2.append("\" of length ");
                sb2.append(strR.length());
                throw new IllegalArgumentException(sb2.toString());
            }
            long j16 = 0;
            while (i11 < 8) {
                long j17 = j16 << 4;
                char cCharAt3 = strR.charAt(i11);
                if ((cCharAt3 >>> '\b') == 0) {
                    long j18 = kotlin.text.d.f26598b[cCharAt3];
                    if (j18 >= 0) {
                        j16 = j17 | j18;
                        i11++;
                    }
                }
                o30.f0.W(i11, strR, "a hexadecimal digit");
                throw null;
            }
            if (strR.charAt(8) != '-') {
                o30.f0.W(8, strR, "'-' (hyphen)");
                throw null;
            }
            long j19 = 0;
            for (int i13 = 9; i13 < 13; i13++) {
                long j21 = j19 << 4;
                char cCharAt4 = strR.charAt(i13);
                if ((cCharAt4 >>> '\b') == 0) {
                    long j22 = kotlin.text.d.f26598b[cCharAt4];
                    if (j22 >= 0) {
                        j19 = j21 | j22;
                    }
                }
                o30.f0.W(i13, strR, "a hexadecimal digit");
                throw null;
            }
            if (strR.charAt(13) != '-') {
                o30.f0.W(13, strR, "'-' (hyphen)");
                throw null;
            }
            long j23 = 0;
            for (int i14 = 14; i14 < 18; i14++) {
                long j24 = j23 << 4;
                char cCharAt5 = strR.charAt(i14);
                if ((cCharAt5 >>> '\b') == 0) {
                    long j25 = kotlin.text.d.f26598b[cCharAt5];
                    if (j25 >= 0) {
                        j23 = j24 | j25;
                    }
                }
                o30.f0.W(i14, strR, "a hexadecimal digit");
                throw null;
            }
            if (strR.charAt(18) != '-') {
                o30.f0.W(18, strR, "'-' (hyphen)");
                throw null;
            }
            long j26 = 0;
            for (int i15 = 19; i15 < 23; i15++) {
                long j27 = j26 << 4;
                char cCharAt6 = strR.charAt(i15);
                if ((cCharAt6 >>> '\b') == 0) {
                    long j28 = kotlin.text.d.f26598b[cCharAt6];
                    if (j28 >= 0) {
                        j26 = j27 | j28;
                    }
                }
                o30.f0.W(i15, strR, "a hexadecimal digit");
                throw null;
            }
            if (strR.charAt(23) != '-') {
                o30.f0.W(23, strR, "'-' (hyphen)");
                throw null;
            }
            long j29 = 0;
            for (int i16 = 24; i16 < 36; i16++) {
                long j31 = j29 << 4;
                char cCharAt7 = strR.charAt(i16);
                if ((cCharAt7 >>> '\b') == 0) {
                    long j32 = kotlin.text.d.f26598b[cCharAt7];
                    if (j32 >= 0) {
                        j29 = j31 | j32;
                    }
                }
                o30.f0.W(i16, strR, "a hexadecimal digit");
                throw null;
            }
            long j33 = (j16 << 32) | (j19 << 16) | j23;
            long j34 = (j26 << 48) | j29;
            if (j33 != 0 || j34 != 0) {
                return new q80.a(j33, j34);
            }
        }
        return q80.a.f36355c;
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return f29802b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        q80.a aVar = (q80.a) obj;
        encoder.getClass();
        aVar.getClass();
        encoder.D(aVar.toString());
    }
}
