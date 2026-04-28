package a60;

import com.braze.h2;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonEncodingException;
import java.io.EOFException;
import java.math.BigDecimal;
import kotlin.text.Charsets;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f850a;

    public /* synthetic */ d0(int i11) {
        this.f850a = i11;
    }

    @Override // a60.k
    public final Object a(p pVar) throws EOFException, JsonEncodingException {
        long jLongValueExact;
        switch (this.f850a) {
            case 0:
                return pVar.a0();
            case 1:
                int iP = pVar.f894g;
                if (iP == 0) {
                    iP = pVar.p();
                }
                boolean z11 = false;
                if (iP == 5) {
                    pVar.f894g = 0;
                    int[] iArr = pVar.f891d;
                    int i11 = pVar.f888a - 1;
                    iArr[i11] = iArr[i11] + 1;
                    z11 = true;
                } else {
                    if (iP != 6) {
                        StringBuilder sb2 = new StringBuilder("Expected a boolean but was ");
                        sb2.append(pVar.i0());
                        a40.d0.p(sb2, pVar.B());
                        return null;
                    }
                    pVar.f894g = 0;
                    int[] iArr2 = pVar.f891d;
                    int i12 = pVar.f888a - 1;
                    iArr2[i12] = iArr2[i12] + 1;
                }
                return Boolean.valueOf(z11);
            case 2:
                return Byte.valueOf((byte) h0.h(pVar, "a byte", -128, 255));
            case 3:
                String strA0 = pVar.a0();
                if (strA0.length() <= 1) {
                    return Character.valueOf(strA0.charAt(0));
                }
                throw new JsonDataException(j4.s.k("Expected a char but was ", e0.f.g('\"', "\"", strA0), " at path ", pVar.B()));
            case 4:
                return Double.valueOf(pVar.I());
            case 5:
                float fI = (float) pVar.I();
                if (!Float.isInfinite(fI)) {
                    return Float.valueOf(fI);
                }
                throw new JsonDataException("JSON forbids NaN and infinities: " + fI + " at path " + pVar.B());
            case 6:
                return Integer.valueOf(pVar.J());
            case 7:
                int iP2 = pVar.f894g;
                if (iP2 == 0) {
                    iP2 = pVar.p();
                }
                if (iP2 != 16) {
                    if (iP2 == 17) {
                        ia0.g gVar = pVar.f893f;
                        long j9 = pVar.f896i;
                        gVar.getClass();
                        pVar.f897j = gVar.a0(j9, Charsets.UTF_8);
                    } else {
                        if (iP2 != 9 && iP2 != 8) {
                            if (iP2 != 11) {
                                StringBuilder sb3 = new StringBuilder("Expected a long but was ");
                                sb3.append(pVar.i0());
                                a40.d0.p(sb3, pVar.B());
                            }
                            return null;
                        }
                        String strZ = iP2 == 9 ? pVar.Z(p.l) : pVar.Z(p.f886k);
                        pVar.f897j = strZ;
                        try {
                            jLongValueExact = Long.parseLong(strZ);
                            pVar.f894g = 0;
                            int[] iArr3 = pVar.f891d;
                            int i13 = pVar.f888a - 1;
                            iArr3[i13] = iArr3[i13] + 1;
                        } catch (NumberFormatException unused) {
                            pVar.f894g = 11;
                            jLongValueExact = new BigDecimal(pVar.f897j).longValueExact();
                            pVar.f897j = null;
                            pVar.f894g = 0;
                            int[] iArr4 = pVar.f891d;
                            int i14 = pVar.f888a - 1;
                            iArr4[i14] = iArr4[i14] + 1;
                        }
                    }
                    pVar.f894g = 11;
                    try {
                        jLongValueExact = new BigDecimal(pVar.f897j).longValueExact();
                        pVar.f897j = null;
                        pVar.f894g = 0;
                        int[] iArr42 = pVar.f891d;
                        int i142 = pVar.f888a - 1;
                        iArr42[i142] = iArr42[i142] + 1;
                    } catch (ArithmeticException | NumberFormatException unused2) {
                        a40.d0.l("Expected a long but was ", pVar.f897j, pVar.B());
                    }
                    break;
                } else {
                    pVar.f894g = 0;
                    int[] iArr5 = pVar.f891d;
                    int i15 = pVar.f888a - 1;
                    iArr5[i15] = iArr5[i15] + 1;
                    jLongValueExact = pVar.f895h;
                }
                return Long.valueOf(jLongValueExact);
            case 8:
                return Short.valueOf((short) h0.h(pVar, "a short", -32768, 32767));
            case 9:
                pVar.getClass();
                if (pVar.i0() == o.NULL) {
                    pVar.Q();
                    return null;
                }
                String strA02 = pVar.a0();
                strA02.getClass();
                return g90.b.Companion.c(strA02);
            case 10:
                pVar.getClass();
                if (pVar.i0() == o.NULL) {
                    pVar.Q();
                    return null;
                }
                String strA03 = pVar.a0();
                strA03.getClass();
                fc.a aVar = new fc.a();
                aVar.f17545a = strA03;
                return aVar;
            default:
                pVar.getClass();
                if (pVar.i0() == o.NULL) {
                    pVar.Q();
                    return null;
                }
                String strA04 = pVar.a0();
                strA04.getClass();
                fc.a aVar2 = new fc.a();
                aVar2.f17545a = strA04;
                return aVar2;
        }
    }

    @Override // a60.k
    public final void e(q qVar, Object obj) {
        switch (this.f850a) {
            case 0:
                qVar.J((String) obj);
                return;
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (qVar.f903e) {
                    h2.b("Boolean cannot be used as a map key in JSON at path ".concat(qVar.t()));
                    return;
                }
                qVar.L();
                qVar.a();
                qVar.f905g.F0(zBooleanValue ? "true" : "false");
                int[] iArr = qVar.f902d;
                int i11 = qVar.f899a - 1;
                iArr[i11] = iArr[i11] + 1;
                return;
            case 2:
                qVar.I(((Byte) obj).intValue() & 255);
                return;
            case 3:
                qVar.J(((Character) obj).toString());
                return;
            case 4:
                double dDoubleValue = ((Double) obj).doubleValue();
                qVar.getClass();
                if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was " + dDoubleValue);
                }
                if (qVar.f903e) {
                    qVar.f903e = false;
                    qVar.u(Double.toString(dDoubleValue));
                    return;
                }
                qVar.L();
                qVar.a();
                qVar.f905g.F0(Double.toString(dDoubleValue));
                int[] iArr2 = qVar.f902d;
                int i12 = qVar.f899a - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return;
            case 5:
                Float f11 = (Float) obj;
                f11.getClass();
                qVar.getClass();
                String string = f11.toString();
                if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                    j4.d.o(f11, "Numeric values must be finite, but was ");
                    return;
                }
                if (qVar.f903e) {
                    qVar.f903e = false;
                    qVar.u(string);
                    return;
                }
                qVar.L();
                qVar.a();
                qVar.f905g.F0(string);
                int[] iArr3 = qVar.f902d;
                int i13 = qVar.f899a - 1;
                iArr3[i13] = iArr3[i13] + 1;
                return;
            case 6:
                qVar.I(((Integer) obj).intValue());
                return;
            case 7:
                qVar.I(((Long) obj).longValue());
                return;
            case 8:
                qVar.I(((Short) obj).intValue());
                return;
            case 9:
                g90.b bVar = (g90.b) obj;
                qVar.getClass();
                if (bVar == null) {
                    qVar.A();
                    return;
                } else {
                    qVar.J(bVar.toString());
                    return;
                }
            case 10:
                fc.a aVar = (fc.a) obj;
                qVar.getClass();
                if (aVar == null) {
                    qVar.A();
                    return;
                } else {
                    qVar.J(aVar.f17545a);
                    return;
                }
            default:
                fc.a aVar2 = (fc.a) obj;
                qVar.getClass();
                if (aVar2 == null) {
                    qVar.A();
                    return;
                } else {
                    qVar.J("FILTERED");
                    return;
                }
        }
    }

    public String toString() {
        switch (this.f850a) {
            case 0:
                return "JsonAdapter(String)";
            case 1:
                return "JsonAdapter(Boolean)";
            case 2:
                return "JsonAdapter(Byte)";
            case 3:
                return "JsonAdapter(Character)";
            case 4:
                return "JsonAdapter(Double)";
            case 5:
                return "JsonAdapter(Float)";
            case 6:
                return "JsonAdapter(Integer)";
            case 7:
                return "JsonAdapter(Long)";
            case 8:
                return "JsonAdapter(Short)";
            default:
                return super.toString();
        }
    }
}
