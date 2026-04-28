package te;

import android.graphics.Color;
import android.view.animation.Interpolator;
import androidx.lifecycle.n1;
import com.braze.Constants;
import java.util.ArrayList;
import java.util.Collections;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a60.n f40105a = a60.n.b("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", Constants.BRAZE_PUSH_TITLE_KEY, "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a60.n f40106b = a60.n.b(Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, Constants.BRAZE_PUSH_CONTENT_KEY);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a60.n f40107c = a60.n.b("ty", "nm");

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v65 */
    /* JADX WARN: Type inference failed for: r15v66 */
    /* JADX WARN: Type inference failed for: r15v69 */
    /* JADX WARN: Type inference failed for: r15v70 */
    /* JADX WARN: Type inference failed for: r15v73 */
    /* JADX WARN: Type inference failed for: r15v74 */
    /* JADX WARN: Type inference failed for: r15v77 */
    /* JADX WARN: Type inference failed for: r15v78 */
    /* JADX WARN: Type inference failed for: r15v81 */
    /* JADX WARN: Type inference failed for: r15v82 */
    /* JADX WARN: Type inference failed for: r15v83 */
    /* JADX WARN: Type inference failed for: r15v89 */
    public static re.h a(ue.e eVar, he.k kVar) {
        boolean z11;
        String str;
        Float f11;
        String str2;
        String str3;
        boolean z12;
        float f12;
        String strU0;
        String str4;
        String str5;
        Float f13;
        float f14;
        Float f15;
        pe.b bVar;
        pe.b bVar2;
        pe.b bVar3;
        ?? r15;
        float f16;
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        re.g gVar = re.g.NONE;
        qe.h hVar = qe.h.NORMAL;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        eVar.e();
        boolean z13 = false;
        re.g gVar2 = gVar;
        qe.h hVar2 = hVar;
        float fA = 0.0f;
        float fA2 = 0.0f;
        float fA3 = 0.0f;
        float fA4 = 0.0f;
        float fA5 = 0.0f;
        boolean z14 = false;
        int iC = 0;
        int iC2 = 0;
        int color = 0;
        boolean zU = false;
        pe.d dVar = null;
        re.f fVar = null;
        String strG = null;
        jb.b bVar4 = null;
        n1 n1Var = null;
        pe.a aVar = null;
        oz.m mVar = null;
        pe.b bVarH0 = null;
        float fA6 = 1.0f;
        long jB = 0;
        String strG2 = null;
        String strG3 = "UNSET";
        long jB2 = -1;
        while (eVar.t()) {
            boolean z15 = true;
            switch (eVar.J(f40105a)) {
                case 0:
                    str5 = strG2;
                    strG3 = eVar.G();
                    strG2 = str5;
                    break;
                case 1:
                    f11 = fValueOf;
                    str2 = strG2;
                    jB = eVar.B();
                    strG2 = str2;
                    fValueOf = f11;
                    break;
                case 2:
                    str5 = strG2;
                    strG = eVar.G();
                    strG2 = str5;
                    break;
                case 3:
                    f11 = fValueOf;
                    str3 = strG2;
                    z12 = z13;
                    f12 = fA6;
                    int iB = eVar.B();
                    fVar = re.f.UNKNOWN;
                    if (iB < fVar.ordinal()) {
                        fVar = re.f.values()[iB];
                    }
                    z13 = z12;
                    strG2 = str3;
                    fA6 = f12;
                    fValueOf = f11;
                    break;
                case 4:
                    f11 = fValueOf;
                    str2 = strG2;
                    jB2 = eVar.B();
                    strG2 = str2;
                    fValueOf = f11;
                    break;
                case 5:
                    f11 = fValueOf;
                    str2 = strG2;
                    iC = (int) (ve.k.c() * eVar.B());
                    strG2 = str2;
                    fValueOf = f11;
                    break;
                case 6:
                    f11 = fValueOf;
                    str2 = strG2;
                    iC2 = (int) (ve.k.c() * eVar.B());
                    strG2 = str2;
                    fValueOf = f11;
                    break;
                case 7:
                    f11 = fValueOf;
                    str2 = strG2;
                    color = Color.parseColor(eVar.G());
                    strG2 = str2;
                    fValueOf = f11;
                    break;
                case 8:
                    str5 = strG2;
                    dVar = c.c(eVar, kVar);
                    strG2 = str5;
                    break;
                case 9:
                    f11 = fValueOf;
                    str3 = strG2;
                    z12 = z13;
                    f12 = fA6;
                    int iB2 = eVar.B();
                    if (iB2 >= re.g.values().length) {
                        kVar.a("Unsupported matte type: " + iB2);
                    } else {
                        gVar2 = re.g.values()[iB2];
                        int i11 = r.f40104a[gVar2.ordinal()];
                        if (i11 == 1) {
                            kVar.a("Unsupported matte type: Luma");
                        } else if (i11 == 2) {
                            kVar.a("Unsupported matte type: Luma Inverted");
                        }
                        kVar.f21940p++;
                    }
                    z13 = z12;
                    strG2 = str3;
                    fA6 = f12;
                    fValueOf = f11;
                    break;
                case 10:
                    f11 = fValueOf;
                    f12 = fA6;
                    eVar.a();
                    while (eVar.t()) {
                        eVar.e();
                        boolean zU2 = false;
                        qe.i iVar = null;
                        pe.a aVar2 = null;
                        pe.a aVarJ0 = null;
                        while (eVar.t()) {
                            strU0 = eVar.u0();
                            strU0.getClass();
                            switch (strU0) {
                                case "o":
                                    str4 = strG2;
                                    aVarJ0 = m0.c.j0(eVar, kVar);
                                    break;
                                case "pt":
                                    str4 = strG2;
                                    aVar2 = new pe.a(q.a(eVar, kVar, ve.k.c(), z.f40117a, false), 5);
                                    break;
                                case "inv":
                                    zU2 = eVar.u();
                                    str4 = strG2;
                                    break;
                                case "mode":
                                    String strG4 = eVar.G();
                                    strG4.getClass();
                                    switch (strG4) {
                                        case "a":
                                            iVar = qe.i.MASK_MODE_ADD;
                                            break;
                                        case "i":
                                            kVar.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                            iVar = qe.i.MASK_MODE_INTERSECT;
                                            break;
                                        case "n":
                                            iVar = qe.i.MASK_MODE_NONE;
                                            break;
                                        case "s":
                                            iVar = qe.i.MASK_MODE_SUBTRACT;
                                            break;
                                        default:
                                            ve.c.b("Unknown mask mode " + strU0 + ". Defaulting to Add.");
                                            iVar = qe.i.MASK_MODE_ADD;
                                            break;
                                    }
                                    str4 = strG2;
                                    break;
                                default:
                                    eVar.O();
                                    str4 = strG2;
                                    break;
                            }
                            strG2 = str4;
                        }
                        eVar.p();
                        arrayList.add(new qe.j(iVar, aVar2, aVarJ0, zU2));
                        strG2 = strG2;
                    }
                    str3 = strG2;
                    z12 = false;
                    kVar.f21940p += arrayList.size();
                    eVar.g();
                    z13 = z12;
                    strG2 = str3;
                    fA6 = f12;
                    fValueOf = f11;
                    break;
                case 11:
                    f11 = fValueOf;
                    f12 = fA6;
                    eVar.a();
                    while (eVar.t()) {
                        qe.b bVarA = g.a(eVar, kVar);
                        if (bVarA != null) {
                            arrayList2.add(bVarA);
                        }
                    }
                    eVar.g();
                    str3 = strG2;
                    z12 = false;
                    z13 = z12;
                    strG2 = str3;
                    fA6 = f12;
                    fValueOf = f11;
                    break;
                case 12:
                    f13 = fValueOf;
                    f14 = fA6;
                    eVar.e();
                    while (eVar.t()) {
                        int iJ = eVar.J(f40106b);
                        if (iJ == 0) {
                            aVar = new pe.a(q.a(eVar, kVar, ve.k.c(), h.f40080a, false), 6);
                        } else if (iJ != 1) {
                            eVar.L();
                            eVar.O();
                        } else {
                            eVar.a();
                            if (eVar.t()) {
                                a60.n nVar = b.f40059a;
                                eVar.e();
                                n1 n1Var2 = null;
                                com.google.firebase.messaging.a0 a0Var = null;
                                while (eVar.t()) {
                                    int iJ2 = eVar.J(b.f40059a);
                                    if (iJ2 != 0) {
                                        boolean z16 = true;
                                        if (iJ2 != 1) {
                                            eVar.L();
                                            eVar.O();
                                        } else {
                                            eVar.e();
                                            pe.a aVarG0 = null;
                                            pe.a aVarG02 = null;
                                            pe.b bVarH02 = null;
                                            pe.b bVarH03 = null;
                                            pe.a aVarJ02 = null;
                                            while (eVar.t()) {
                                                int iJ3 = eVar.J(b.f40061c);
                                                if (iJ3 == 0) {
                                                    aVarG0 = m0.c.g0(eVar, kVar);
                                                } else if (iJ3 == z16) {
                                                    aVarG02 = m0.c.g0(eVar, kVar);
                                                } else if (iJ3 == 2) {
                                                    bVarH02 = m0.c.h0(eVar, kVar, z16);
                                                } else if (iJ3 == 3) {
                                                    bVarH03 = m0.c.h0(eVar, kVar, z16);
                                                } else if (iJ3 != 4) {
                                                    eVar.L();
                                                    eVar.O();
                                                } else {
                                                    aVarJ02 = m0.c.j0(eVar, kVar);
                                                }
                                                z16 = true;
                                            }
                                            eVar.p();
                                            n1Var2 = new n1(aVarG0, aVarG02, bVarH02, bVarH03, aVarJ02);
                                        }
                                    } else {
                                        eVar.e();
                                        pe.a aVar3 = null;
                                        pe.a aVarJ03 = null;
                                        pe.a aVarJ04 = null;
                                        qe.z zVar = null;
                                        while (eVar.t()) {
                                            int iJ4 = eVar.J(b.f40060b);
                                            if (iJ4 != 0) {
                                                int i12 = 1;
                                                if (iJ4 == 1) {
                                                    aVarJ03 = m0.c.j0(eVar, kVar);
                                                } else if (iJ4 == 2) {
                                                    aVarJ04 = m0.c.j0(eVar, kVar);
                                                } else if (iJ4 != 3) {
                                                    eVar.L();
                                                    eVar.O();
                                                } else {
                                                    int iB3 = eVar.B();
                                                    if (iB3 != 1) {
                                                        if (iB3 != 2) {
                                                            kVar.a("Unsupported text range units: " + iB3);
                                                            zVar = qe.z.INDEX;
                                                        } else {
                                                            i12 = 1;
                                                        }
                                                    }
                                                    zVar = iB3 == i12 ? qe.z.PERCENT : qe.z.INDEX;
                                                }
                                            } else {
                                                aVar3 = m0.c.j0(eVar, kVar);
                                            }
                                        }
                                        eVar.p();
                                        if (aVar3 == null && aVarJ03 != null) {
                                            aVar3 = new pe.a(Collections.singletonList(new we.a(0)), 2);
                                        }
                                        a0Var = new com.google.firebase.messaging.a0(19, aVar3, aVarJ03, aVarJ04, zVar);
                                    }
                                }
                                eVar.p();
                                mVar = new oz.m(4, n1Var2, a0Var);
                            }
                            while (eVar.t()) {
                                eVar.O();
                            }
                            eVar.g();
                        }
                    }
                    eVar.p();
                    fA6 = f14;
                    fValueOf = f13;
                    z13 = false;
                    break;
                case 13:
                    f14 = fA6;
                    eVar.a();
                    ArrayList arrayList3 = new ArrayList();
                    while (eVar.t()) {
                        eVar.e();
                        while (eVar.t()) {
                            int iJ5 = eVar.J(f40107c);
                            if (iJ5 == 0) {
                                int iB4 = eVar.B();
                                if (iB4 == 29) {
                                    a60.n nVar2 = d.f40066a;
                                    bVar4 = null;
                                    while (eVar.t()) {
                                        if (eVar.J(d.f40066a) != 0) {
                                            eVar.L();
                                            eVar.O();
                                        } else {
                                            eVar.a();
                                            while (eVar.t()) {
                                                eVar.e();
                                                boolean z17 = false;
                                                jb.b bVar5 = null;
                                                while (eVar.t()) {
                                                    int iJ6 = eVar.J(d.f40067b);
                                                    if (iJ6 == 0) {
                                                        z17 = eVar.B() == 0 ? z15 : false;
                                                    } else if (iJ6 != z15) {
                                                        eVar.L();
                                                        eVar.O();
                                                    } else if (z17) {
                                                        bVar5 = new jb.b(m0.c.h0(eVar, kVar, z15));
                                                    } else {
                                                        eVar.O();
                                                    }
                                                }
                                                eVar.p();
                                                if (bVar5 != null) {
                                                    bVar4 = bVar5;
                                                }
                                            }
                                            eVar.g();
                                        }
                                    }
                                } else {
                                    if (iB4 == 25) {
                                        i iVar2 = new i();
                                        while (eVar.t()) {
                                            if (eVar.J(i.f40082f) != 0) {
                                                eVar.L();
                                                eVar.O();
                                            } else {
                                                eVar.a();
                                                while (eVar.t()) {
                                                    eVar.e();
                                                    String strG5 = "";
                                                    while (eVar.t()) {
                                                        int iJ7 = eVar.J(i.f40083g);
                                                        if (iJ7 == 0) {
                                                            strG5 = eVar.G();
                                                        } else if (iJ7 == z15) {
                                                            strG5.getClass();
                                                            switch (strG5.hashCode()) {
                                                                case 353103893:
                                                                    r15 = !strG5.equals("Distance") ? -1 : 0;
                                                                    break;
                                                                case 397447147:
                                                                    r15 = !strG5.equals("Opacity") ? -1 : z15;
                                                                    break;
                                                                case 1041377119:
                                                                    r15 = !strG5.equals("Direction") ? -1 : 2;
                                                                    break;
                                                                case 1379387491:
                                                                    r15 = !strG5.equals("Shadow Color") ? -1 : 3;
                                                                    break;
                                                                case 1383710113:
                                                                    r15 = !strG5.equals("Softness") ? -1 : 4;
                                                                    break;
                                                                default:
                                                                    r15 = -1;
                                                                    break;
                                                            }
                                                            switch (r15) {
                                                                case 0:
                                                                    iVar2.f40087d = m0.c.h0(eVar, kVar, z15);
                                                                    break;
                                                                case 1:
                                                                    iVar2.f40085b = m0.c.h0(eVar, kVar, false);
                                                                    break;
                                                                case 2:
                                                                    iVar2.f40086c = m0.c.h0(eVar, kVar, false);
                                                                    break;
                                                                case 3:
                                                                    iVar2.f40084a = m0.c.g0(eVar, kVar);
                                                                    break;
                                                                case 4:
                                                                    iVar2.f40088e = m0.c.h0(eVar, kVar, z15);
                                                                    break;
                                                                default:
                                                                    eVar.O();
                                                                    break;
                                                            }
                                                        } else {
                                                            eVar.L();
                                                            eVar.O();
                                                        }
                                                        z15 = true;
                                                    }
                                                    eVar.p();
                                                    z15 = true;
                                                }
                                                eVar.g();
                                                z15 = true;
                                            }
                                        }
                                        pe.a aVar4 = iVar2.f40084a;
                                        if (aVar4 == null || (bVar = iVar2.f40085b) == null || (bVar2 = iVar2.f40086c) == null) {
                                            f15 = fValueOf;
                                        } else {
                                            f15 = fValueOf;
                                            pe.b bVar6 = iVar2.f40087d;
                                            if (bVar6 != null && (bVar3 = iVar2.f40088e) != null) {
                                                n1Var = new n1(aVar4, bVar, bVar2, bVar6, bVar3);
                                            }
                                        }
                                        n1Var = null;
                                    }
                                    fValueOf = f15;
                                    z15 = true;
                                }
                            } else if (iJ5 != z15) {
                                eVar.L();
                                eVar.O();
                            } else {
                                arrayList3.add(eVar.G());
                            }
                            f15 = fValueOf;
                            fValueOf = f15;
                            z15 = true;
                        }
                        eVar.p();
                        z15 = true;
                    }
                    f13 = fValueOf;
                    eVar.g();
                    kVar.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList3);
                    fA6 = f14;
                    fValueOf = f13;
                    z13 = false;
                    break;
                case 14:
                    fA6 = (float) eVar.A();
                    z13 = false;
                    break;
                case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                    fA5 = (float) eVar.A();
                    z13 = false;
                    break;
                case 16:
                    f16 = fA6;
                    fA3 = (float) (eVar.A() * ((double) ve.k.c()));
                    fA6 = f16;
                    z13 = false;
                    break;
                case 17:
                    f16 = fA6;
                    fA4 = (float) (eVar.A() * ((double) ve.k.c()));
                    fA6 = f16;
                    z13 = false;
                    break;
                case 18:
                    fA = (float) eVar.A();
                    break;
                case 19:
                    fA2 = (float) eVar.A();
                    break;
                case 20:
                    bVarH0 = m0.c.h0(eVar, kVar, z13);
                    break;
                case 21:
                    strG2 = eVar.G();
                    break;
                case 22:
                    zU = eVar.u();
                    break;
                case 23:
                    z14 = eVar.B() != 1 ? z13 : true;
                    break;
                case 24:
                    int iB5 = eVar.B();
                    if (iB5 < qe.h.values().length) {
                        hVar2 = qe.h.values()[iB5];
                    } else {
                        kVar.a("Unsupported Blend Mode: " + iB5);
                        hVar2 = qe.h.NORMAL;
                    }
                    break;
                default:
                    eVar.L();
                    eVar.O();
                    f11 = fValueOf;
                    str3 = strG2;
                    z12 = z13;
                    f12 = fA6;
                    z13 = z12;
                    strG2 = str3;
                    fA6 = f12;
                    fValueOf = f11;
                    break;
            }
        }
        Float f17 = fValueOf;
        String str6 = strG2;
        float f18 = fA6;
        eVar.p();
        ArrayList arrayList4 = new ArrayList();
        if (fA > 0.0f) {
            z11 = z14;
            str = str6;
            arrayList4.add(new we.a(kVar, f17, f17, (Interpolator) null, 0.0f, Float.valueOf(fA)));
        } else {
            z11 = z14;
            str = str6;
        }
        if (fA2 <= 0.0f) {
            fA2 = kVar.f21937m;
        }
        arrayList4.add(new we.a(kVar, fValueOf2, fValueOf2, (Interpolator) null, fA, Float.valueOf(fA2)));
        arrayList4.add(new we.a(kVar, f17, f17, (Interpolator) null, fA2, Float.valueOf(Float.MAX_VALUE)));
        if (strG3.endsWith(".ai") || "ai".equals(str)) {
            kVar.a("Convert your Illustrator layers to shape layers.");
        }
        if (z11) {
            if (dVar == null) {
                dVar = new pe.d();
            }
            pe.d dVar2 = dVar;
            dVar2.f34733m = z11;
            dVar = dVar2;
        }
        return new re.h(arrayList2, kVar, strG3, jB, fVar, jB2, strG, arrayList, dVar, iC, iC2, color, f18, fA5, fA3, fA4, aVar, mVar, arrayList4, gVar2, bVarH0, zU, bVar4, n1Var, hVar2);
    }
}
