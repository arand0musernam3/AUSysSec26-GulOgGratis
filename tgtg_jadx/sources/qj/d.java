package qj;

import android.net.Uri;
import com.adyen.checkout.issuerlist.internal.ui.DefaultIssuerListDelegate;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.order.OrderType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.bouncycastle.i18n.ErrorBundle;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static m a(Uri uri) {
        String strB;
        int iHashCode;
        m l0Var;
        HashMap map;
        ArrayList arrayList;
        m h0Var;
        m m0Var;
        j0 j0Var = j0.f37110a;
        uri.getClass();
        t1 t1Var = new t1(uri);
        try {
            strB = t1Var.b(0);
            iHashCode = strB.hashCode();
            l0Var = null;
            l0Var = null;
            l0Var = null;
            l0Var = null;
            l0Var = null;
            l0Var = null;
            l0Var = null;
            l0Var = null;
            l0Var = null;
            l0Var = null;
            map = t1Var.f37147c;
            arrayList = t1Var.f37146b;
        } catch (Exception unused) {
        }
        switch (iHashCode) {
            case -1599112198:
                if (strB.equals("invitations")) {
                    int size = arrayList.size();
                    Integer numValueOf = Integer.valueOf(size);
                    if (size < 3) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        l0Var = new l0(t1Var.b(2));
                    }
                    h0Var = l0Var;
                }
                break;
            case -1555927131:
                h0Var = !strB.equals("checknotificationstatus") ? j0Var : s0.f37141a;
                break;
            case -1550361553:
                if (strB.equals("flashsalesitem") && arrayList.size() > 1) {
                    h0Var = new h0(ItemId.m198constructorimpl(t1Var.a(1)), map);
                }
                break;
            case -1380604278:
                if (strB.equals("browse")) {
                    int size2 = arrayList.size();
                    h0Var = ((size2 >= 2 ? Integer.valueOf(size2) : null) != null && Intrinsics.areEqual(t1Var.b(1), "filter")) ? new o(true) : new o(false);
                }
                break;
            case -934914674:
                if (strB.equals("recipe")) {
                    h0Var = h1.f37099a;
                    int size3 = arrayList.size();
                    Integer numValueOf2 = Integer.valueOf(size3);
                    if (size3 < 2) {
                        numValueOf2 = null;
                    }
                    if (numValueOf2 != null) {
                        String strB2 = t1Var.b(1);
                        if (Intrinsics.areEqual(strB2, "saved")) {
                            h0Var = i1.f37108a;
                        } else if (!Intrinsics.areEqual(strB2, "generate")) {
                            String strA = t1Var.a(1);
                            String str = StringsKt.H(strA) ? null : strA;
                            if (str != null) {
                                h0Var = new j1(str);
                            }
                        }
                    }
                }
                break;
            case -892066894:
                if (strB.equals("stores")) {
                    h0Var = j(t1Var);
                }
                break;
            case -840442044:
                if (strB.equals("unlock")) {
                    int size4 = arrayList.size();
                    Integer numValueOf3 = Integer.valueOf(size4);
                    if (size4 < 3) {
                        numValueOf3 = null;
                    }
                    if (numValueOf3 != null && Intrinsics.areEqual(t1Var.b(1), "hidden")) {
                        l0Var = new p1(t1Var.a(2));
                    }
                    h0Var = l0Var;
                }
                break;
            case -808725189:
                if (strB.equals("receipts")) {
                    h0Var = h(t1Var);
                }
                break;
            case -788047292:
                if (strB.equals("widget")) {
                    if (!Intrinsics.areEqual(t1Var.b(1), "favorites")) {
                        h0Var = s1.f37142a;
                    } else {
                        h0Var = r1.f37138a;
                    }
                }
                break;
            case -486424414:
                if (strB.equals("favorites-screen")) {
                    if (!Intrinsics.areEqual(t1Var.b(1), "getnotified")) {
                        h0Var = e0.f37076a;
                    } else {
                        h0Var = f0.f37080a;
                    }
                }
                break;
            case -411129154:
                if (strB.equals("contactus")) {
                    h0Var = d(t1Var);
                }
                break;
            case -321051962:
                if (strB.equals("email-confirmation")) {
                    int size5 = arrayList.size();
                    Integer numValueOf4 = Integer.valueOf(size5);
                    if (size5 < 2) {
                        numValueOf4 = null;
                    }
                    if (numValueOf4 != null) {
                        l0Var = new u(t1Var.a(1));
                    }
                    h0Var = l0Var;
                }
                break;
            case -309425751:
                if (strB.equals("profile")) {
                    h0Var = g(t1Var);
                }
                break;
            case -139919088:
                if (strB.equals("campaign")) {
                    int size6 = arrayList.size();
                    Integer numValueOf5 = Integer.valueOf(size6);
                    if (size6 < 3) {
                        numValueOf5 = null;
                    }
                    if (numValueOf5 != null) {
                        l0Var = new k(t1Var.a(2));
                    }
                    h0Var = l0Var;
                }
                break;
            case 3480:
                if (strB.equals("me")) {
                    h0Var = f(t1Var);
                }
                break;
            case 96788:
                if (strB.equals("c2c")) {
                    h0Var = c(t1Var);
                }
                break;
            case 3026850:
                if (strB.equals("blog")) {
                    h0Var = n.f37122a;
                }
                break;
            case 3242771:
                if (strB.equals("item")) {
                    if (arrayList.size() >= 3 && Intrinsics.areEqual(t1Var.b(2), "delivery")) {
                        if (arrayList.size() > 1) {
                            h0Var = new b0(ItemId.m198constructorimpl(t1Var.a(1)), map);
                            break;
                        }
                    } else if (arrayList.size() >= 3 && Intrinsics.areEqual(t1Var.b(2), "catering")) {
                        if (arrayList.size() > 1) {
                            h0Var = new s(ItemId.m198constructorimpl(t1Var.a(1)), map);
                            break;
                        }
                    } else if (arrayList.size() > 1) {
                        String strM198constructorimpl = ItemId.m198constructorimpl(t1Var.a(1));
                        String strA2 = t1Var.a(2);
                        if (Intrinsics.areEqual(strA2, "campaign")) {
                            strA2 = t1Var.a(3);
                        }
                        m0Var = new m0(strM198constructorimpl, strA2, map);
                        h0Var = m0Var;
                        break;
                    }
                }
                break;
            case 103149417:
                if (strB.equals("login")) {
                    int size7 = arrayList.size();
                    Integer numValueOf6 = Integer.valueOf(size7);
                    if (size7 < 4) {
                        numValueOf6 = null;
                    }
                    if (numValueOf6 != null) {
                        l0Var = new d0(t1Var.a(2), t1Var.a(3));
                    }
                    h0Var = l0Var;
                }
                break;
            case 109770977:
                if (strB.equals("store")) {
                    if (arrayList.size() >= 3 && Intrinsics.areEqual(t1Var.a(2), "collaboration")) {
                        h0Var = new m1(t1Var.a(1));
                    } else if (arrayList.size() >= 2) {
                        h0Var = new n1(t1Var.a(1));
                    }
                    break;
                }
                break;
            case 173789089:
                if (strB.equals("partnerlogin")) {
                    int size8 = arrayList.size();
                    Integer numValueOf7 = Integer.valueOf(size8);
                    if (size8 < 3) {
                        numValueOf7 = null;
                    }
                    if (numValueOf7 != null) {
                        l0Var = new y0(t1Var.a(1), t1Var.a(2));
                    }
                    h0Var = l0Var;
                }
                break;
            case 256660486:
                if (strB.equals("flashsalesbucket")) {
                    int size9 = arrayList.size();
                    Integer numValueOf8 = Integer.valueOf(size9);
                    if (size9 < 2) {
                        numValueOf8 = null;
                    }
                    if (numValueOf8 != null) {
                        l0Var = new g0(t1Var.a(1));
                    }
                    h0Var = l0Var;
                }
                break;
            case 273184745:
                if (strB.equals("discover")) {
                    h0Var = e(t1Var);
                }
                break;
            case 327094492:
                if (strB.equals("payment-cards")) {
                    h0Var = z0.f37161a;
                }
                break;
            case 640192174:
                if (strB.equals("voucher")) {
                    h0Var = q1.f37135a;
                }
                break;
            case 809500335:
                if (strB.equals("discover_reload")) {
                    int size10 = arrayList.size();
                    Integer numValueOf9 = Integer.valueOf(size10);
                    if (size10 < 1) {
                        numValueOf9 = null;
                    }
                    if (numValueOf9 != null) {
                        l0Var = c0.f37069a;
                    }
                    h0Var = l0Var;
                }
                break;
            case 823466996:
                if (strB.equals("delivery")) {
                    if (arrayList.size() <= 1) {
                        h0Var = z.f37160a;
                    } else {
                        String upperCase = t1Var.b(1).toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                        h0Var = new y(upperCase);
                    }
                }
                break;
            case 884554045:
                if (strB.equals("how-it-works")) {
                    h0Var = new v(true);
                }
                break;
            case 1195341721:
                if (strB.equals("invitation")) {
                    int size11 = arrayList.size();
                    Integer numValueOf10 = Integer.valueOf(size11);
                    if (size11 < 3) {
                        numValueOf10 = null;
                    }
                    if (numValueOf10 != null) {
                        l0Var = new k0(t1Var.b(2));
                    }
                    h0Var = l0Var;
                }
                break;
            case 1382682413:
                if (strB.equals("payments")) {
                    h0Var = b1.f37068a;
                    String strB3 = t1Var.b(1);
                    switch (strB3.hashCode()) {
                        case -515191025:
                            if (strB3.equals("parcelbasket")) {
                                h0Var = d1.f37073a;
                            }
                            break;
                        case -479169343:
                            if (strB3.equals("manufacture")) {
                                h0Var = c1.f37070a;
                            }
                            break;
                        case 50832895:
                            if (strB3.equals("catering")) {
                                h0Var = a1.f37063a;
                            }
                            break;
                        case 1178530872:
                            strB3.equals("itemview");
                            break;
                    }
                } else {
                    break;
                }
                break;
            case 1434631203:
                if (strB.equals("settings")) {
                    h0Var = i(t1Var);
                }
                break;
            case 1527551669:
                if (strB.equals("mystore")) {
                    m0Var = new r0(uri);
                    h0Var = m0Var;
                }
                break;
            case 1901043637:
                if (strB.equals("location")) {
                    h0Var = o0.f37126a;
                }
                break;
            default:
                break;
        }
        return h0Var == null ? j0Var : h0Var;
    }

    public static float b(String str) {
        float f11 = 0.0f;
        try {
            f11 = Integer.parseInt(str.substring(0, StringsKt.G(str, ":", 0, false, 6)));
            return Integer.parseInt(str.substring(StringsKt.G(str, ":", 0, false, 6) + 1, str.length())) != 0 ? f11 + 0.5f : f11;
        } catch (Throwable th2) {
            sa0.a.f38953a.i(e0.f.k("Exception Ignored: ", th2.getMessage()), new Object[0]);
            return f11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static qj.q c(qj.t1 r7) {
        /*
            java.util.ArrayList r0 = r7.f37146b
            java.util.HashMap r1 = r7.f37147c
            int r0 = r0.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r3 = 0
            r4 = 3
            if (r0 < r4) goto L11
            goto L12
        L11:
            r2 = r3
        L12:
            if (r2 == 0) goto L8e
            int r0 = r2.intValue()
            r2 = 4
            java.lang.String r3 = "deviceid"
            java.lang.String r5 = "PERSON_A_INCENTIVIZED"
            r6 = 2
            if (r0 != r2) goto L77
            java.lang.String r0 = r7.a(r6)
            int r2 = r0.hashCode()
            r6 = 133113534(0x7ef26be, float:3.5983494E-34)
            if (r2 == r6) goto L51
            r6 = 1146533469(0x4456b65d, float:858.8494)
            if (r2 == r6) goto L44
            r6 = 1805547054(0x6b9e762e, float:3.8313673E26)
            if (r2 == r6) goto L38
            goto L59
        L38:
            java.lang.String r2 = "person-a-incentivized"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L41
            goto L59
        L41:
            java.lang.String r0 = "c2c/referral-code/person-a-incentivized"
            goto L62
        L44:
            java.lang.String r2 = "always-on"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L59
            java.lang.String r5 = "ALWAYS_ON"
            java.lang.String r0 = "c2c/referral-code/always-on"
            goto L62
        L51:
            java.lang.String r2 = "always-on-person-a-incentivized"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L5e
        L59:
            java.lang.String r5 = "UNKNOWN"
            java.lang.String r0 = "c2c/referral-code"
            goto L62
        L5e:
            java.lang.String r5 = "ALWAYS_ON_PERSON_A_INCENTIVISED"
            java.lang.String r0 = "c2c/referral-code/always-on-person-a-incentivized"
        L62:
            qj.q r2 = new qj.q
            com.app.tgtg.model.local.DeeplinkC2CReferralData r6 = new com.app.tgtg.model.local.DeeplinkC2CReferralData
            java.lang.String r7 = r7.a(r4)
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            r6.<init>(r7, r5, r1)
            r2.<init>(r6, r0)
            return r2
        L77:
            qj.q r0 = new qj.q
            com.app.tgtg.model.local.DeeplinkC2CReferralData r2 = new com.app.tgtg.model.local.DeeplinkC2CReferralData
            java.lang.String r7 = r7.a(r6)
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            r2.<init>(r7, r5, r1)
            java.lang.String r7 = "c2c/referralcode"
            r0.<init>(r2, r7)
            return r0
        L8e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: qj.d.c(qj.t1):qj.q");
    }

    public static m d(t1 t1Var) {
        ArrayList arrayList = t1Var.f37146b;
        return (arrayList.size() <= 2 || !Intrinsics.areEqual(t1Var.b(1), "order")) ? new v(false) : (arrayList.size() == 4 && kotlin.text.y.k(t1Var.b(3), "MISSED_COLLECTION_CONTACT_AGAIN", true)) ? new w(t1Var.a(2)) : new x(t1Var.a(2));
    }

    public static m e(t1 t1Var) {
        int size = t1Var.f37146b.size();
        Integer numValueOf = Integer.valueOf(size);
        if (size < 3) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return null;
        }
        String strB = t1Var.b(1);
        return Intrinsics.areEqual(strB, "bucket") ? new p(t1Var.a(2)) : Intrinsics.areEqual(strB, "hero") ? new i0(t1Var.a(2), (String) t1Var.f37147c.get("parameter")) : j0.f37110a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static m f(t1 t1Var) {
        ArrayList arrayList = t1Var.f37146b;
        int size = arrayList.size();
        Integer numValueOf = Integer.valueOf(size);
        if (size < 3) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            int size2 = arrayList.size();
            Integer numValueOf2 = Integer.valueOf(size2);
            if (size2 < 2) {
                numValueOf2 = null;
            }
            if (numValueOf2 != null) {
                String strB = t1Var.b(1);
                switch (strB.hashCode()) {
                    case -2140463041:
                        if (strB.equals("impact-co2")) {
                            return t.f37143a;
                        }
                        break;
                    case 93494179:
                        if (strB.equals("badge")) {
                            return new l(null);
                        }
                        break;
                    case 152316294:
                        if (strB.equals("orderhistory")) {
                            return v0.f37152a;
                        }
                        break;
                    case 313648505:
                        if (strB.equals("impact-money")) {
                            return q0.f37134a;
                        }
                        break;
                }
            }
        } else if (Intrinsics.areEqual(t1Var.b(1), "badge")) {
            return new l(t1Var.b(2));
        }
        return p0.f37130a;
    }

    public static m g(t1 t1Var) {
        int size = t1Var.f37146b.size();
        Integer numValueOf = Integer.valueOf(size);
        if (size < 2) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            String strB = t1Var.b(1);
            int iHashCode = strB.hashCode();
            if (iHashCode != 218841809) {
                if (iHashCode != 344177325) {
                    if (iHashCode == 1792144429 && strB.equals("referral-always-on")) {
                        return new r("profile/referral-always-on");
                    }
                } else if (strB.equals("referral-v3")) {
                    return new r("profile/referral-v3");
                }
            } else if (strB.equals("invite-friends")) {
                return new r("profile/invite-friends");
            }
        }
        return e1.f37077a;
    }

    public static m h(t1 t1Var) {
        ArrayList arrayList = t1Var.f37146b;
        int size = arrayList.size();
        w0 w0Var = w0.f37154a;
        if (size > 1) {
            String strB = t1Var.b(1);
            int iHashCode = strB.hashCode();
            if (iHashCode == 3322014) {
                strB.equals(DefaultIssuerListDelegate.ANALYTICS_TARGET);
            } else if (iHashCode != 3493088) {
                if (iHashCode == 1557721666 && strB.equals(ErrorBundle.DETAIL_ENTRY)) {
                    return (arrayList.size() < 4 || !Intrinsics.areEqual(t1Var.b(3), "delivery")) ? new u0(t1Var.b(2), OrderType.MAGICBAG) : new u0(t1Var.b(2), OrderType.MANUFACTURER);
                }
            } else if (strB.equals("rate")) {
                return new x0(t1Var.b(2));
            }
        }
        return w0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r0.equals("notifications") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        if (r0.equals("email") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        return new qj.t0(r3.f37147c);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static qj.m i(qj.t1 r3) {
        /*
            java.util.ArrayList r0 = r3.f37146b
            int r0 = r0.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r2 = 1
            if (r0 <= r2) goto Le
            goto Lf
        Le:
            r1 = 0
        Lf:
            if (r1 == 0) goto L4f
            java.lang.String r0 = r3.b(r2)
            int r1 = r0.hashCode()
            switch(r1) {
                case -501038005: goto L43;
                case 96619420: goto L32;
                case 610995061: goto L26;
                case 1272354024: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L4f
        L1d:
            java.lang.String r1 = "notifications"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3b
            goto L4f
        L26:
            java.lang.String r3 = "accountdetails"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L2f
            goto L4f
        L2f:
            qj.j r3 = qj.j.f37109a
            return r3
        L32:
            java.lang.String r1 = "email"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3b
            goto L4f
        L3b:
            qj.t0 r0 = new qj.t0
            java.util.HashMap r3 = r3.f37147c
            r0.<init>(r3)
            return r0
        L43:
            java.lang.String r3 = "specialrewards"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L4c
            goto L4f
        L4c:
            qj.l1 r3 = qj.l1.f37117a
            return r3
        L4f:
            qj.k1 r3 = qj.k1.f37114a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: qj.d.i(qj.t1):qj.m");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        if (r2.equals(com.adyen.checkout.issuerlist.internal.ui.DefaultIssuerListDelegate.ANALYTICS_TARGET) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (r2.equals("map") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r20.b(2), "favorites") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        return qj.e0.f37076a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        r4 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (r3.size() > 3) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        r2 = r20.b(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r2, "filter") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        r9 = new com.app.tgtg.model.local.SearchFilter(false, null, null, null, null, null, null, false, 255, null);
        r2 = new java.util.ArrayList();
        r3 = r3.size() - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0096, code lost:
    
        if (r4 >= r3) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0098, code lost:
    
        r10 = r4 + 1;
        r4 = r20.b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a2, code lost:
    
        switch(r4.hashCode()) {
            case -964459482: goto L56;
            case -906336856: goto L52;
            case -738432521: goto L48;
            case 3083252: goto L44;
            case 50511102: goto L40;
            case 479309432: goto L36;
            default: goto L81;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ad, code lost:
    
        if (r4.equals("hidesoldout") != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b1, code lost:
    
        r9.setShowOnlyAvailable(kotlin.jvm.internal.Intrinsics.areEqual(r20.b(r10), "1"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c6, code lost:
    
        if (r4.equals("category") != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c9, code lost:
    
        r9.setFoodTypes(com.app.tgtg.model.remote.item.ItemCategory.INSTANCE.fromStringToList(r20.b(r10)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00dd, code lost:
    
        if (r4.equals("diet") != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e0, code lost:
    
        r9.setDietPrefs(com.app.tgtg.model.local.DietPreferenceModel.INSTANCE.fromStringToList(r20.b(r10)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f4, code lost:
    
        if (r4.equals("pickupto") != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f7, code lost:
    
        r2.add(1, java.lang.Float.valueOf(b(r20.b(r10))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x010b, code lost:
    
        if (r4.equals("search") != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x010e, code lost:
    
        r9.setSearchText(r20.a(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x011c, code lost:
    
        if (r4.equals("pickupfrom") != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011f, code lost:
    
        r2.add(0, java.lang.Float.valueOf(b(r20.b(r10))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012e, code lost:
    
        r4 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0135, code lost:
    
        if (r2.isEmpty() != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0137, code lost:
    
        com.app.tgtg.model.local.CollectionTimeModel.setTimes$default(r9.getCollectionTimes(), kotlin.collections.CollectionsKt.r0(r2), false, 2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0142, code lost:
    
        r9.setFromDeepLink(true);
        r7 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r2, "search") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x014d, code lost:
    
        r8 = new com.app.tgtg.model.local.SearchFilter(false, null, null, null, null, new kotlin.text.Regex("\\+").replace(r20.a(3), " "), null, false, com.app.tgtg.model.local.AppConstants.GO_TO_GPS_SETTINGS, null);
        r8.setFromDeepLink(true);
        r7 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0173, code lost:
    
        if (r7 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x017e, code lost:
    
        return new qj.o1(r7, r20.b(1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0188, code lost:
    
        return new qj.n0(r20.b(1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static qj.m j(qj.t1 r20) {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qj.d.j(qj.t1):qj.m");
    }
}
