package wi;

import a3.t0;
import cg.v0;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.item.response.ItemType;
import com.app.tgtg.model.remote.user.requests.UserAddress;
import d2.b2;
import d2.h2;
import d2.i2;
import d2.m2;
import g3.r9;
import g3.s0;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import lv.t;
import lv.v;
import m3.w1;
import m5.u0;
import o00.x0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h {
    public static final void a(UserAddress userAddress, jg.c cVar, ItemType itemType, Function0 function0, m3.n nVar, int i11) {
        int i12;
        int i13;
        b4.q qVar;
        boolean z11;
        int i14;
        float f11;
        UserAddress userAddress2;
        cVar.getClass();
        itemType.getClass();
        function0.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(390728802);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(userAddress) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.d(cVar.ordinal()) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.d(itemType.ordinal()) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(function0) ? NewHope.SENDB_BYTES : 1024;
        }
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            b4.q qVar2 = b4.q.f5711a;
            if (userAddress == null) {
                sVar.a0(840567398);
                sVar.q(false);
                userAddress2 = null;
                i13 = i12;
                qVar = qVar2;
                z11 = false;
            } else {
                sVar.a0(840567399);
                String name = userAddress.getName();
                if (name == null) {
                    sVar.a0(1476643818);
                    sVar.q(false);
                    i13 = i12;
                    qVar = qVar2;
                    z11 = false;
                } else {
                    sVar.a0(1476643819);
                    i13 = i12;
                    qVar = qVar2;
                    z11 = false;
                    r9.d(name, null, lv.s.D, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28274n, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                    sVar = sVar;
                    b3.i.y(qVar, t.f28248b, sVar, false);
                }
                int i15 = i13 & 112;
                b(userAddress, cVar, sVar, i15);
                e(userAddress, cVar, sVar, i15);
                float f12 = t.f28251e;
                d2.c.f(m2.m(qVar, f12), sVar);
                String phone = userAddress.getPhone();
                if (phone == null) {
                    sVar.a0(1477017678);
                    sVar.q(z11);
                    i14 = i15;
                    f11 = f12;
                } else {
                    sVar.a0(1477017679);
                    String phoneCountryCode = userAddress.getPhoneCountryCode();
                    if (phoneCountryCode == null) {
                        sVar.a0(1105346365);
                        sVar.q(z11);
                        i14 = i15;
                        f11 = f12;
                    } else {
                        sVar.a0(1105346366);
                        m3.s sVar2 = sVar;
                        i14 = i15;
                        f11 = f12;
                        r9.d("+" + phoneCountryCode + " " + phone, null, lv.s.D, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28274n, sVar2, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                        sVar = sVar2;
                        sVar.q(z11);
                    }
                    b3.i.y(qVar, t.f28248b, sVar, z11);
                }
                String email = userAddress.getEmail();
                if (email == null) {
                    sVar.a0(1477306319);
                    sVar.q(z11);
                } else {
                    sVar.a0(1477306320);
                    m3.s sVar3 = sVar;
                    r9.d(email, null, lv.s.D, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28274n, sVar3, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                    sVar = sVar3;
                    sVar.q(z11);
                }
                if (itemType == ItemType.CATERING && cVar == jg.c.PL) {
                    sVar.a0(1477555374);
                    c(userAddress, cVar, sVar, i14);
                    b3.i.y(qVar, f11, sVar, z11);
                } else {
                    sVar.a0(1477688953);
                    sVar.q(z11);
                }
                sVar.q(z11);
                userAddress2 = userAddress;
            }
            if (userAddress2 == null) {
                sVar.a0(841677230);
                l2.f fVarA = l2.g.a(100);
                b2 b2Var = g3.p.f19253a;
                m3.s sVar4 = sVar;
                s0.a(function0, m2.d(qVar, 1.0f), false, fVarA, g3.p.a(lv.s.f28217b, 0L, 0L, 0L, sVar, 14), null, null, null, null, a.f43426a, sVar4, ((i13 >> 9) & 14) | 805306416, 484);
                sVar = sVar4;
                sVar.q(z11);
            } else {
                sVar.a0(1828231166);
                sVar.q(z11);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new t0(userAddress, cVar, i11, itemType, function0, 26);
        }
    }

    public static final void b(UserAddress userAddress, jg.c cVar, m3.n nVar, int i11) {
        int i12;
        b4.q qVar;
        boolean z11;
        userAddress.getClass();
        cVar.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1513097599);
        if ((i11 & 6) == 0) {
            i12 = i11 | (sVar.f(userAddress) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.d(cVar.ordinal()) ? 32 : 16;
        }
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            int i13 = g.$EnumSwitchMapping$2[cVar.ordinal()];
            b4.q qVar2 = b4.q.f5711a;
            if (i13 == 1 || i13 == 2 || i13 == 3 || i13 == 4 || i13 == 5) {
                sVar.a0(1009163859);
                String streetName = userAddress.getStreetName();
                if (streetName == null) {
                    sVar.a0(1009163858);
                    sVar.q(false);
                } else {
                    sVar.a0(1009163859);
                    String houseNumberAddition = userAddress.getHouseNumberAddition();
                    if (houseNumberAddition == null || houseNumberAddition.length() == 0) {
                        sVar.a0(-602755242);
                        r9.d(r8.k.m(streetName, " ", userAddress.getHouseNumber()), null, lv.s.D, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28274n, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                        sVar = sVar;
                        sVar.q(false);
                    } else {
                        sVar.a0(-602510342);
                        r9.d(streetName + " " + userAddress.getHouseNumber() + ", " + userAddress.getHouseNumberAddition(), null, lv.s.D, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28274n, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                        sVar = sVar;
                        sVar.q(false);
                    }
                    b3.i.y(qVar2, t.f28248b, sVar, false);
                }
                sVar.q(false);
            } else {
                sVar.a0(1009905007);
                String address1 = userAddress.getAddress1();
                if (address1 == null) {
                    sVar.a0(1009927450);
                    sVar.q(false);
                    qVar = qVar2;
                    z11 = false;
                } else {
                    sVar.a0(1009927451);
                    qVar = qVar2;
                    z11 = false;
                    r9.d(address1, null, lv.s.D, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28274n, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                    sVar = sVar;
                    b3.i.y(qVar, t.f28248b, sVar, false);
                }
                String address2 = userAddress.getAddress2();
                if (address2 == null) {
                    sVar.a0(1010226631);
                    sVar.q(z11);
                } else {
                    sVar.a0(1010226632);
                    if (address2.length() > 0) {
                        sVar.a0(72224229);
                        m3.s sVar2 = sVar;
                        r9.d(address2, null, lv.s.D, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28274n, sVar2, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                        sVar = sVar2;
                        b3.i.y(qVar, t.f28248b, sVar, z11);
                    } else {
                        sVar.a0(72493309);
                        sVar.q(z11);
                    }
                    sVar.q(z11);
                }
                sVar.q(z11);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new f(userAddress, cVar, i11, 1);
        }
    }

    public static final void c(UserAddress userAddress, jg.c cVar, m3.n nVar, int i11) {
        int i12;
        int i13;
        b4.q qVar;
        userAddress.getClass();
        cVar.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(977442061);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(userAddress) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.d(cVar.ordinal()) ? 32 : 16;
        }
        if (!sVar.R(i12 & 1, (i12 & 19) != 18)) {
            i13 = 0;
            sVar.U();
        } else if (cVar == jg.c.PL) {
            sVar.a0(-901578666);
            float f11 = t.f28254h;
            b4.q qVar2 = b4.q.f5711a;
            i13 = 0;
            r9.d(r8.k.f(f11, R.string.catering_address_extra_details_header, qVar2, sVar, sVar), null, lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28279s, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
            sVar = sVar;
            String deliveryAccessCode = userAddress.getDeliveryAccessCode();
            if (deliveryAccessCode == null) {
                sVar.a0(-901302643);
                sVar.q(false);
                qVar = qVar2;
            } else {
                sVar.a0(-901302642);
                d2.c.f(m2.m(qVar2, t.f28251e), sVar);
                qVar = qVar2;
                r9.d(f0.T(R.string.catering_address_security_code_formatted, new Object[]{deliveryAccessCode}, sVar), null, lv.s.D, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28274n, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                sVar = sVar;
                sVar.q(false);
            }
            String deliveryInstructions = userAddress.getDeliveryInstructions();
            if (deliveryInstructions == null) {
                sVar.a0(-900969579);
                sVar.q(false);
            } else {
                sVar.a0(-900969578);
                d2.c.f(m2.m(qVar, t.f28251e), sVar);
                m3.s sVar2 = sVar;
                r9.d(deliveryInstructions, null, lv.s.D, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28274n, sVar2, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                sVar = sVar2;
                sVar.q(false);
            }
            sVar.q(false);
        } else {
            i13 = 0;
            sVar.a0(-900749323);
            sVar.q(false);
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new f(userAddress, cVar, i11, i13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(cj.q r45, com.app.tgtg.model.remote.user.requests.UserAddress r46, kotlin.jvm.functions.Function0 r47, kotlin.jvm.functions.Function0 r48, kotlin.jvm.functions.Function0 r49, m3.n r50, int r51) {
        /*
            Method dump skipped, instruction units count: 1289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wi.h.d(cj.q, com.app.tgtg.model.remote.user.requests.UserAddress, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, m3.n, int):void");
    }

    public static final void e(UserAddress userAddress, jg.c cVar, m3.n nVar, int i11) {
        int i12;
        boolean z11;
        b4.q qVar;
        userAddress.getClass();
        cVar.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(433053146);
        if ((i11 & 6) == 0) {
            i12 = i11 | (sVar.f(userAddress) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.d(cVar.ordinal()) ? 32 : 16;
        }
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            String postalCode = userAddress.getPostalCode();
            if (postalCode == null) {
                sVar.a0(-995270208);
                sVar.q(false);
            } else {
                sVar.a0(-995270207);
                String city = userAddress.getCity();
                if (city == null) {
                    sVar.a0(1954740911);
                    sVar.q(false);
                    z11 = false;
                } else {
                    sVar.a0(1954740912);
                    String country = userAddress.getCountry();
                    if (country == null) {
                        sVar.a0(-1901402038);
                        sVar.q(false);
                        z11 = false;
                    } else {
                        sVar.a0(-1901402037);
                        String displayCountry = new Locale.Builder().setRegion(country).build().getDisplayCountry();
                        String state = userAddress.getState();
                        String strConcat = state != null ? state.concat(", ") : "";
                        int i13 = g.$EnumSwitchMapping$2[cVar.ordinal()];
                        b4.q qVar2 = b4.q.f5711a;
                        if (i13 == 5) {
                            z11 = false;
                            qVar = qVar2;
                            sVar.a0(-881489977);
                            r9.d(postalCode + " " + city, null, lv.s.D, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28274n, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                            sVar = sVar;
                            sVar.q(false);
                        } else if (i13 == 6) {
                            z11 = false;
                            qVar = qVar2;
                            sVar.a0(-882721917);
                            u0 u0Var = v.f28274n;
                            long j9 = lv.s.D;
                            r9.d(city, null, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                            d2.c.f(m2.m(qVar, t.f28248b), sVar);
                            r9.d(postalCode, null, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                            sVar = sVar;
                            sVar.q(false);
                        } else if (i13 != 7) {
                            sVar.a0(-881222261);
                            qVar = qVar2;
                            z11 = false;
                            r9.d(postalCode + " " + city + ", " + ((Object) strConcat) + displayCountry, null, lv.s.D, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28274n, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                            sVar = sVar;
                            sVar.q(false);
                        } else {
                            z11 = false;
                            qVar = qVar2;
                            sVar.a0(-882163111);
                            String str = postalCode + " " + city;
                            u0 u0Var2 = v.f28274n;
                            long j11 = lv.s.D;
                            r9.d(str, null, j11, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var2, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                            sVar = sVar;
                            String state2 = userAddress.getState();
                            if (state2 == null) {
                                sVar.a0(-881912973);
                                sVar.q(false);
                            } else {
                                sVar.a0(-881912972);
                                d2.c.f(m2.m(qVar, t.f28248b), sVar);
                                r9.d(state2, null, j11, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var2, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                                sVar = sVar;
                                sVar.q(false);
                            }
                            sVar.q(false);
                        }
                        b3.i.y(qVar, t.f28248b, sVar, z11);
                    }
                    sVar.q(z11);
                }
                sVar.q(z11);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new f(userAddress, cVar, i11, 2);
        }
    }

    public static final void f(String str, String str2, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-506730446);
        int i12 = (sVar.f(str) ? 4 : 2) | i11 | (sVar.f(str2) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            r9.d(f0.U(sVar, R.string.checkout_overview_parcel_title_your_items), null, lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28279s, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
            float f11 = t.f28251e;
            b4.q qVar = b4.q.f5711a;
            d2.c.f(m2.m(qVar, f11), sVar);
            b4.t tVarD = m2.d(qVar, 1.0f);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5692j, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarD, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            b4.t tVarM = m2.m(qVar, 48);
            l2.f fVar = l2.g.f26790a;
            gd.o.c(str, null, v1.n.k(f4.g.b(tVarM, fVar), 1, lv.s.H, fVar), x0.z(R.drawable.gfx_tgtg_logo_green_small, sVar, 0), null, null, z4.l.f47166a, 0.0f, null, sVar, (i12 & 14) | 4144, 6, 31728);
            r9.d(str2 == null ? "" : str2, b3.i.g(b4.d.f5693k, d2.c.D(qVar, f11, 0.0f, f11, 0.0f, 10)), lv.s.D, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, v.f28274n, sVar, MLKEMEngine.KyberPolyBytes, 12607872, 110584);
            sVar = sVar;
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new v0(str, str2, i11, 3);
        }
    }
}
