package te;

import android.graphics.Rect;
import com.adyen.checkout.issuerlist.internal.ui.DefaultIssuerListDelegate;
import com.braze.Constants;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.HashMap;
import q1.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a60.n f40108a = a60.n.b("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a60.n f40109b = a60.n.b("id", "layers", "w", "h", Constants.BRAZE_PUSH_PRIORITY_KEY, "u");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a60.n f40110c = a60.n.b(DefaultIssuerListDelegate.ANALYTICS_TARGET);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a60.n f40111d = a60.n.b("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0045. Please report as an issue. */
    public static he.k a(ue.e eVar) throws ue.b, EOFException {
        he.k kVar;
        float f11;
        he.k kVar2;
        he.k kVar3;
        int i11;
        float f12;
        he.k kVar4;
        float f13;
        float f14;
        int i12;
        float fC = ve.k.c();
        q1.z zVar = new q1.z((Object) null);
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        l1 l1Var = new l1(0);
        he.k kVar5 = new he.k();
        eVar.e();
        int iA = 0;
        int iA2 = 0;
        float fA = 0.0f;
        float fA2 = 0.0f;
        float fA3 = 0.0f;
        while (eVar.t()) {
            switch (eVar.J(f40108a)) {
                case 0:
                    kVar = kVar5;
                    iA = (int) eVar.A();
                    kVar5 = kVar;
                    break;
                case 1:
                    kVar = kVar5;
                    iA2 = (int) eVar.A();
                    kVar5 = kVar;
                    break;
                case 2:
                    kVar = kVar5;
                    fA2 = (float) eVar.A();
                    kVar5 = kVar;
                    break;
                case 3:
                    f11 = fC;
                    kVar2 = kVar5;
                    fA = ((float) eVar.A()) - 0.01f;
                    kVar5 = kVar2;
                    fC = f11;
                    break;
                case 4:
                    f11 = fC;
                    kVar2 = kVar5;
                    fA3 = (float) eVar.A();
                    kVar5 = kVar2;
                    fC = f11;
                    break;
                case 5:
                    f11 = fC;
                    kVar3 = kVar5;
                    i11 = iA2;
                    f12 = fA2;
                    String[] strArrSplit = eVar.G().split("\\.");
                    int i13 = Integer.parseInt(strArrSplit[0]);
                    int i14 = Integer.parseInt(strArrSplit[1]);
                    int i15 = Integer.parseInt(strArrSplit[2]);
                    if (i13 < 4 || (i13 <= 4 && (i14 < 4 || (i14 <= 4 && i15 < 0)))) {
                        kVar3.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    kVar5 = kVar3;
                    iA2 = i11;
                    fA2 = f12;
                    fC = f11;
                    break;
                case 6:
                    f11 = fC;
                    he.k kVar6 = kVar5;
                    i11 = iA2;
                    f12 = fA2;
                    eVar.a();
                    int i16 = 0;
                    while (eVar.t()) {
                        he.k kVar7 = kVar6;
                        re.h hVarA = s.a(eVar, kVar7);
                        if (hVarA.f37926e == re.f.IMAGE) {
                            i16++;
                        }
                        arrayList.add(hVarA);
                        zVar.h(hVarA.f37925d, hVarA);
                        if (i16 > 4) {
                            ve.c.b("You have " + i16 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                        kVar6 = kVar7;
                    }
                    kVar3 = kVar6;
                    eVar.g();
                    kVar5 = kVar3;
                    iA2 = i11;
                    fA2 = f12;
                    fC = f11;
                    break;
                case 7:
                    f11 = fC;
                    i11 = iA2;
                    f12 = fA2;
                    eVar.a();
                    while (eVar.t()) {
                        ArrayList arrayList3 = new ArrayList();
                        q1.z zVar2 = new q1.z((Object) null);
                        eVar.e();
                        String strG = null;
                        String strG2 = null;
                        String strG3 = null;
                        int iB = 0;
                        int iB2 = 0;
                        while (eVar.t()) {
                            int iJ = eVar.J(f40109b);
                            if (iJ != 0) {
                                if (iJ == 1) {
                                    eVar.a();
                                    while (eVar.t()) {
                                        re.h hVarA2 = s.a(eVar, kVar5);
                                        zVar2.h(hVarA2.f37925d, hVarA2);
                                        arrayList3.add(hVarA2);
                                        kVar5 = kVar5;
                                    }
                                    kVar4 = kVar5;
                                    eVar.g();
                                } else if (iJ == 2) {
                                    iB = eVar.B();
                                } else if (iJ == 3) {
                                    iB2 = eVar.B();
                                } else if (iJ == 4) {
                                    strG2 = eVar.G();
                                } else if (iJ != 5) {
                                    eVar.L();
                                    eVar.O();
                                    kVar4 = kVar5;
                                } else {
                                    strG3 = eVar.G();
                                }
                                kVar5 = kVar4;
                            } else {
                                strG = eVar.G();
                            }
                        }
                        he.k kVar8 = kVar5;
                        eVar.p();
                        if (strG2 != null) {
                            map2.put(strG, new he.b0(iB, iB2, strG, strG2, strG3));
                        } else {
                            map.put(strG, arrayList3);
                        }
                        kVar5 = kVar8;
                    }
                    eVar.g();
                    kVar3 = kVar5;
                    kVar5 = kVar3;
                    iA2 = i11;
                    fA2 = f12;
                    fC = f11;
                    break;
                case 8:
                    f11 = fC;
                    i11 = iA2;
                    float f15 = fA2;
                    eVar.e();
                    while (eVar.t()) {
                        if (eVar.J(f40110c) != 0) {
                            eVar.L();
                            eVar.O();
                        } else {
                            eVar.a();
                            while (eVar.t()) {
                                a60.n nVar = k.f40091a;
                                eVar.e();
                                String strG4 = null;
                                String strG5 = null;
                                String strG6 = null;
                                while (eVar.t()) {
                                    int iJ2 = eVar.J(k.f40091a);
                                    if (iJ2 != 0) {
                                        float f16 = f15;
                                        if (iJ2 == 1) {
                                            strG5 = eVar.G();
                                        } else if (iJ2 == 2) {
                                            strG6 = eVar.G();
                                        } else if (iJ2 != 3) {
                                            eVar.L();
                                            eVar.O();
                                        } else {
                                            eVar.A();
                                        }
                                        f15 = f16;
                                    } else {
                                        strG4 = eVar.G();
                                    }
                                }
                                eVar.p();
                                map3.put(strG5, new oe.d(strG4, strG5, strG6));
                                f15 = f15;
                            }
                            eVar.g();
                        }
                    }
                    f12 = f15;
                    eVar.p();
                    kVar3 = kVar5;
                    kVar5 = kVar3;
                    iA2 = i11;
                    fA2 = f12;
                    fC = f11;
                    break;
                case 9:
                    f11 = fC;
                    i11 = iA2;
                    f13 = fA2;
                    eVar.a();
                    while (eVar.t()) {
                        a60.n nVar2 = j.f40089a;
                        ArrayList arrayList4 = new ArrayList();
                        eVar.e();
                        double dA = 0.0d;
                        char cCharAt = 0;
                        String strG7 = null;
                        String strG8 = null;
                        while (eVar.t()) {
                            int iJ3 = eVar.J(j.f40089a);
                            if (iJ3 == 0) {
                                cCharAt = eVar.G().charAt(0);
                            } else if (iJ3 == 1) {
                                eVar.A();
                            } else if (iJ3 == 2) {
                                dA = eVar.A();
                            } else if (iJ3 == 3) {
                                strG7 = eVar.G();
                            } else if (iJ3 == 4) {
                                strG8 = eVar.G();
                            } else if (iJ3 != 5) {
                                eVar.L();
                                eVar.O();
                            } else {
                                eVar.e();
                                while (eVar.t()) {
                                    if (eVar.J(j.f40090b) != 0) {
                                        eVar.L();
                                        eVar.O();
                                    } else {
                                        eVar.a();
                                        while (eVar.t()) {
                                            arrayList4.add((qe.s) g.a(eVar, kVar5));
                                        }
                                        eVar.g();
                                    }
                                }
                                eVar.p();
                            }
                        }
                        eVar.p();
                        oe.e eVar2 = new oe.e(arrayList4, cCharAt, dA, strG7, strG8);
                        l1Var.d(eVar2.hashCode(), eVar2);
                    }
                    eVar.g();
                    f12 = f13;
                    kVar3 = kVar5;
                    kVar5 = kVar3;
                    iA2 = i11;
                    fA2 = f12;
                    fC = f11;
                    break;
                case 10:
                    eVar.a();
                    while (eVar.t()) {
                        eVar.e();
                        String strG9 = null;
                        float fA4 = 0.0f;
                        float fA5 = 0.0f;
                        while (eVar.t()) {
                            int iJ4 = eVar.J(f40111d);
                            if (iJ4 != 0) {
                                f14 = fC;
                                if (iJ4 == 1) {
                                    i12 = iA2;
                                    fA2 = fA2;
                                    fA4 = (float) eVar.A();
                                } else if (iJ4 != 2) {
                                    eVar.L();
                                    eVar.O();
                                } else {
                                    i12 = iA2;
                                    fA2 = fA2;
                                    fA5 = (float) eVar.A();
                                }
                                iA2 = i12;
                            } else {
                                f14 = fC;
                                strG9 = eVar.G();
                            }
                            fC = f14;
                        }
                        eVar.p();
                        arrayList2.add(new oe.i(strG9, fA4, fA5));
                        fA2 = fA2;
                        iA2 = iA2;
                        fC = fC;
                    }
                    f11 = fC;
                    i11 = iA2;
                    f13 = fA2;
                    eVar.g();
                    f12 = f13;
                    kVar3 = kVar5;
                    kVar5 = kVar3;
                    iA2 = i11;
                    fA2 = f12;
                    fC = f11;
                    break;
                default:
                    eVar.L();
                    eVar.O();
                    f11 = fC;
                    kVar3 = kVar5;
                    i11 = iA2;
                    f12 = fA2;
                    kVar5 = kVar3;
                    iA2 = i11;
                    fA2 = f12;
                    fC = f11;
                    break;
            }
        }
        float f17 = fC;
        he.k kVar9 = kVar5;
        Rect rect = new Rect(0, 0, (int) (iA * f17), (int) (iA2 * f17));
        float fC2 = ve.k.c();
        kVar9.f21936k = rect;
        kVar9.l = fA2;
        kVar9.f21937m = fA;
        kVar9.f21938n = fA3;
        kVar9.f21935j = arrayList;
        kVar9.f21934i = zVar;
        kVar9.f21928c = map;
        kVar9.f21929d = map2;
        kVar9.f21930e = fC2;
        kVar9.f21933h = l1Var;
        kVar9.f21931f = map3;
        kVar9.f21932g = arrayList2;
        return kVar9;
    }
}
