package y00;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.n5;
import com.google.android.gms.internal.measurement.o5;
import com.google.android.gms.internal.measurement.ye;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.iana.AEADAlgorithm;
import zendesk.messaging.android.internal.conversationscreen.ConversationTypingEvents;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class v1 extends n5 implements j0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l4 f45249g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Boolean f45250h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f45251i;

    public v1(l4 l4Var) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        com.google.android.gms.common.internal.i0.h(l4Var);
        this.f45249g = l4Var;
        this.f45251i = null;
    }

    @Override // y00.j0
    public final void B(e eVar, t4 t4Var) {
        com.google.android.gms.common.internal.i0.h(eVar);
        com.google.android.gms.common.internal.i0.h(eVar.f44691c);
        C(t4Var);
        e eVar2 = new e(eVar);
        eVar2.f44689a = t4Var.f45170a;
        K(new ye(6, this, eVar2, t4Var, false));
    }

    public final void C(t4 t4Var) {
        com.google.android.gms.common.internal.i0.h(t4Var);
        String str = t4Var.f45170a;
        com.google.android.gms.common.internal.i0.e(str);
        J(str, false);
        this.f45249g.l0().v(t4Var.f45171b);
    }

    @Override // y00.j0
    public final String E(t4 t4Var) {
        C(t4Var);
        l4 l4Var = this.f45249g;
        try {
            return (String) l4Var.d().w(new o1(l4Var, t4Var)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e5) {
            l4Var.b().f45260g.c("Failed to get app instance id. appId", w0.x(t4Var.f45170a), e5);
            return null;
        }
    }

    @Override // y00.j0
    public final void F(t4 t4Var) {
        C(t4Var);
        K(new p1(this, t4Var, 0));
    }

    @Override // y00.j0
    public final i H(t4 t4Var) {
        C(t4Var);
        String str = t4Var.f45170a;
        com.google.android.gms.common.internal.i0.e(str);
        l4 l4Var = this.f45249g;
        try {
            return (i) l4Var.d().x(new o1(this, t4Var, 1)).get(ConversationTypingEvents.TIME_INTERVAL_IN_MILLIS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e5) {
            l4Var.b().f45260g.c("Failed to get consent. appId", w0.x(str), e5);
            return new i(null);
        }
    }

    @Override // y00.j0
    public final void I(t4 t4Var, d dVar) {
        C(t4Var);
        K(new ye(this, t4Var, dVar, 10));
    }

    public final void J(String str, boolean z11) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        l4 l4Var = this.f45249g;
        if (zIsEmpty) {
            l4Var.b().f45260g.a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z11) {
            try {
                if (this.f45250h == null) {
                    boolean z12 = true;
                    if (!"com.google.android.gms".equals(this.f45251i) && !vz.c.d(l4Var.l.f44982a, Binder.getCallingUid()) && !pz.f.a(l4Var.l.f44982a).b(Binder.getCallingUid())) {
                        z12 = false;
                    }
                    this.f45250h = Boolean.valueOf(z12);
                }
                if (this.f45250h.booleanValue()) {
                    return;
                }
            } catch (SecurityException e5) {
                l4Var.b().f45260g.b(w0.x(str), "Measurement Service called with invalid calling package. appId");
                throw e5;
            }
        }
        if (this.f45251i == null) {
            Context context = l4Var.l.f44982a;
            int callingUid = Binder.getCallingUid();
            AtomicBoolean atomicBoolean = pz.e.f35655a;
            if (vz.c.g(context, str, callingUid)) {
                this.f45251i = str;
            }
        }
        if (str.equals(this.f45251i)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    public final void K(Runnable runnable) {
        l4 l4Var = this.f45249g;
        if (l4Var.d().v()) {
            runnable.run();
        } else {
            l4Var.d().y(runnable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.n5
    public final boolean a(int i11, Parcel parcel, Parcel parcel2) {
        List list;
        l4 l4Var = this.f45249g;
        ArrayList arrayList = null;
        l0 k0Var = null;
        n0 m0Var = null;
        int i12 = 1;
        switch (i11) {
            case 1:
                u uVar = (u) o5.a(parcel, u.CREATOR);
                t4 t4Var = (t4) o5.a(parcel, t4.CREATOR);
                o5.d(parcel);
                u(uVar, t4Var);
                parcel2.writeNoException();
                return true;
            case 2:
                o4 o4Var = (o4) o5.a(parcel, o4.CREATOR);
                t4 t4Var2 = (t4) o5.a(parcel, t4.CREATOR);
                o5.d(parcel);
                w(o4Var, t4Var2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            case 28:
            default:
                return false;
            case 4:
                t4 t4Var3 = (t4) o5.a(parcel, t4.CREATOR);
                o5.d(parcel);
                F(t4Var3);
                parcel2.writeNoException();
                return true;
            case 5:
                u uVar2 = (u) o5.a(parcel, u.CREATOR);
                String string = parcel.readString();
                parcel.readString();
                o5.d(parcel);
                com.google.android.gms.common.internal.i0.h(uVar2);
                com.google.android.gms.common.internal.i0.e(string);
                J(string, true);
                K(new ye(8, this, uVar2, string, false));
                parcel2.writeNoException();
                return true;
            case 6:
                t4 t4Var4 = (t4) o5.a(parcel, t4.CREATOR);
                o5.d(parcel);
                f(t4Var4);
                parcel2.writeNoException();
                return true;
            case 7:
                t4 t4Var5 = (t4) o5.a(parcel, t4.CREATOR);
                Object[] objArr = parcel.readInt() != 0;
                o5.d(parcel);
                C(t4Var5);
                String str = t4Var5.f45170a;
                com.google.android.gms.common.internal.i0.h(str);
                try {
                    List<p4> list2 = (List) l4Var.d().w(new o1(this, str, 0)).get();
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    for (p4 p4Var : list2) {
                        if (objArr != false || !r4.U(p4Var.f45070c)) {
                            arrayList2.add(new o4(p4Var));
                        }
                        break;
                    }
                    arrayList = arrayList2;
                } catch (InterruptedException e5) {
                    e = e5;
                    l4Var.b().f45260g.c("Failed to get user properties. appId", w0.x(str), e);
                } catch (ExecutionException e11) {
                    e = e11;
                    l4Var.b().f45260g.c("Failed to get user properties. appId", w0.x(str), e);
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                u uVar3 = (u) o5.a(parcel, u.CREATOR);
                String string2 = parcel.readString();
                o5.d(parcel);
                byte[] bArrV = v(string2, uVar3);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrV);
                return true;
            case 10:
                long j9 = parcel.readLong();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                o5.d(parcel);
                l(j9, string3, string4, string5);
                parcel2.writeNoException();
                return true;
            case 11:
                t4 t4Var6 = (t4) o5.a(parcel, t4.CREATOR);
                o5.d(parcel);
                String strE = E(t4Var6);
                parcel2.writeNoException();
                parcel2.writeString(strE);
                return true;
            case 12:
                e eVar = (e) o5.a(parcel, e.CREATOR);
                t4 t4Var7 = (t4) o5.a(parcel, t4.CREATOR);
                o5.d(parcel);
                B(eVar, t4Var7);
                parcel2.writeNoException();
                return true;
            case 13:
                e eVar2 = (e) o5.a(parcel, e.CREATOR);
                o5.d(parcel);
                com.google.android.gms.common.internal.i0.h(eVar2);
                com.google.android.gms.common.internal.i0.h(eVar2.f44691c);
                com.google.android.gms.common.internal.i0.e(eVar2.f44689a);
                J(eVar2.f44689a, true);
                K(new x0.f(this, new e(eVar2), false, 21));
                parcel2.writeNoException();
                return true;
            case 14:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                ClassLoader classLoader = o5.f11692a;
                z = parcel.readInt() != 0;
                t4 t4Var8 = (t4) o5.a(parcel, t4.CREATOR);
                o5.d(parcel);
                List listJ = j(string6, string7, z, t4Var8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listJ);
                return true;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                ClassLoader classLoader2 = o5.f11692a;
                boolean z11 = parcel.readInt() != 0;
                o5.d(parcel);
                List listG = g(string8, string9, string10, z11);
                parcel2.writeNoException();
                parcel2.writeTypedList(listG);
                return true;
            case 16:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                t4 t4Var9 = (t4) o5.a(parcel, t4.CREATOR);
                o5.d(parcel);
                List listY = y(string11, string12, t4Var9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listY);
                return true;
            case 17:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                o5.d(parcel);
                List listM = m(string13, string14, string15);
                parcel2.writeNoException();
                parcel2.writeTypedList(listM);
                return true;
            case 18:
                t4 t4Var10 = (t4) o5.a(parcel, t4.CREATOR);
                o5.d(parcel);
                p(t4Var10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) o5.a(parcel, Bundle.CREATOR);
                t4 t4Var11 = (t4) o5.a(parcel, t4.CREATOR);
                o5.d(parcel);
                s(bundle, t4Var11);
                parcel2.writeNoException();
                return true;
            case 20:
                t4 t4Var12 = (t4) o5.a(parcel, t4.CREATOR);
                o5.d(parcel);
                x(t4Var12);
                parcel2.writeNoException();
                return true;
            case 21:
                t4 t4Var13 = (t4) o5.a(parcel, t4.CREATOR);
                o5.d(parcel);
                i iVarH = H(t4Var13);
                parcel2.writeNoException();
                if (iVarH == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                iVarH.writeToParcel(parcel2, 1);
                return true;
            case 24:
                t4 t4Var14 = (t4) o5.a(parcel, t4.CREATOR);
                Bundle bundle2 = (Bundle) o5.a(parcel, Bundle.CREATOR);
                o5.d(parcel);
                C(t4Var14);
                String str2 = t4Var14.f45170a;
                com.google.android.gms.common.internal.i0.h(str2);
                if (!l4Var.f0().A(null, g0.T0)) {
                    try {
                        list = (List) l4Var.d().w(new t1(this, t4Var14, bundle2, i12)).get();
                    } catch (InterruptedException | ExecutionException e12) {
                        l4Var.b().f45260g.c("Failed to get trigger URIs. appId", w0.x(str2), e12);
                        list = Collections.EMPTY_LIST;
                    }
                    break;
                } else {
                    try {
                        list = (List) l4Var.d().x(new t1(this, t4Var14, bundle2, z ? 1 : 0)).get(ConversationTypingEvents.TIME_INTERVAL_IN_MILLIS, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e13) {
                        l4Var.b().f45260g.c("Failed to get trigger URIs. appId", w0.x(str2), e13);
                        list = Collections.EMPTY_LIST;
                    }
                    break;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(list);
                return true;
            case 25:
                t4 t4Var15 = (t4) o5.a(parcel, t4.CREATOR);
                o5.d(parcel);
                i(t4Var15);
                parcel2.writeNoException();
                return true;
            case 26:
                t4 t4Var16 = (t4) o5.a(parcel, t4.CREATOR);
                o5.d(parcel);
                e(t4Var16);
                parcel2.writeNoException();
                return true;
            case 27:
                t4 t4Var17 = (t4) o5.a(parcel, t4.CREATOR);
                o5.d(parcel);
                q(t4Var17);
                parcel2.writeNoException();
                return true;
            case 29:
                t4 t4Var18 = (t4) o5.a(parcel, t4.CREATOR);
                c4 c4Var = (c4) o5.a(parcel, c4.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    m0Var = iInterfaceQueryLocalInterface instanceof n0 ? (n0) iInterfaceQueryLocalInterface : new m0(strongBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback", 0);
                }
                o5.d(parcel);
                o(t4Var18, c4Var, m0Var);
                parcel2.writeNoException();
                return true;
            case 30:
                t4 t4Var19 = (t4) o5.a(parcel, t4.CREATOR);
                d dVar = (d) o5.a(parcel, d.CREATOR);
                o5.d(parcel);
                I(t4Var19, dVar);
                parcel2.writeNoException();
                return true;
            case BERTags.DATE /* 31 */:
                t4 t4Var20 = (t4) o5.a(parcel, t4.CREATOR);
                Bundle bundle3 = (Bundle) o5.a(parcel, Bundle.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    k0Var = iInterfaceQueryLocalInterface2 instanceof l0 ? (l0) iInterfaceQueryLocalInterface2 : new k0(strongBinder2, "com.google.android.gms.measurement.internal.ITriggerUrisCallback", 0);
                }
                o5.d(parcel);
                n(t4Var20, bundle3, k0Var);
                parcel2.writeNoException();
                return true;
        }
    }

    public final void b(Runnable runnable) {
        l4 l4Var = this.f45249g;
        if (l4Var.d().v()) {
            runnable.run();
        } else {
            l4Var.d().A(runnable);
        }
    }

    @Override // y00.j0
    public final void e(t4 t4Var) {
        com.google.android.gms.common.internal.i0.e(t4Var.f45170a);
        com.google.android.gms.common.internal.i0.h(t4Var.f45187s);
        b(new p1(this, t4Var, 2));
    }

    @Override // y00.j0
    public final void f(t4 t4Var) {
        C(t4Var);
        K(new q1(this, t4Var, 1));
    }

    @Override // y00.j0
    public final List g(String str, String str2, String str3, boolean z11) {
        J(str, true);
        l4 l4Var = this.f45249g;
        try {
            List<p4> list = (List) l4Var.d().w(new s1(this, str, str2, str3, 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (p4 p4Var : list) {
                if (z11 || !r4.U(p4Var.f45070c)) {
                    arrayList.add(new o4(p4Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e5) {
            e = e5;
            l4Var.b().f45260g.c("Failed to get user properties as. appId", w0.x(str), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e11) {
            e = e11;
            l4Var.b().f45260g.c("Failed to get user properties as. appId", w0.x(str), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // y00.j0
    public final void i(t4 t4Var) {
        com.google.android.gms.common.internal.i0.e(t4Var.f45170a);
        com.google.android.gms.common.internal.i0.h(t4Var.f45187s);
        b(new q1(this, t4Var, 3));
    }

    @Override // y00.j0
    public final List j(String str, String str2, boolean z11, t4 t4Var) {
        C(t4Var);
        String str3 = t4Var.f45170a;
        com.google.android.gms.common.internal.i0.h(str3);
        l4 l4Var = this.f45249g;
        try {
            List<p4> list = (List) l4Var.d().w(new s1(this, str3, str, str2, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (p4 p4Var : list) {
                if (z11 || !r4.U(p4Var.f45070c)) {
                    arrayList.add(new o4(p4Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e5) {
            e = e5;
            l4Var.b().f45260g.c("Failed to query user properties. appId", w0.x(str3), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e11) {
            e = e11;
            l4Var.b().f45260g.c("Failed to query user properties. appId", w0.x(str3), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // y00.j0
    public final void l(long j9, String str, String str2, String str3) {
        K(new r1(this, str2, str3, str, j9, 0));
    }

    @Override // y00.j0
    public final List m(String str, String str2, String str3) {
        J(str, true);
        l4 l4Var = this.f45249g;
        try {
            return (List) l4Var.d().w(new s1(this, str, str2, str3, 3)).get();
        } catch (InterruptedException | ExecutionException e5) {
            l4Var.b().f45260g.b(e5, "Failed to get conditional user properties as");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // y00.j0
    public final void n(t4 t4Var, Bundle bundle, l0 l0Var) {
        C(t4Var);
        String str = t4Var.f45170a;
        com.google.android.gms.common.internal.i0.h(str);
        this.f45249g.d().y(new u1(this, t4Var, bundle, l0Var, str));
    }

    @Override // y00.j0
    public final void o(t4 t4Var, c4 c4Var, n0 n0Var) {
        C(t4Var);
        String str = t4Var.f45170a;
        com.google.android.gms.common.internal.i0.h(str);
        this.f45249g.d().y(new h7.h1(2, this, str, c4Var, n0Var));
    }

    @Override // y00.j0
    public final void p(t4 t4Var) {
        String str = t4Var.f45170a;
        com.google.android.gms.common.internal.i0.e(str);
        J(str, false);
        K(new p1(this, t4Var, 1));
    }

    @Override // y00.j0
    public final void q(t4 t4Var) {
        C(t4Var);
        K(new q1(this, t4Var, 0));
    }

    @Override // y00.j0
    public final void s(Bundle bundle, t4 t4Var) {
        C(t4Var);
        String str = t4Var.f45170a;
        com.google.android.gms.common.internal.i0.h(str);
        K(new h7.h1(4, this, bundle, str, t4Var));
    }

    @Override // y00.j0
    public final void u(u uVar, t4 t4Var) {
        com.google.android.gms.common.internal.i0.h(uVar);
        C(t4Var);
        K(new ye(7, this, uVar, t4Var, false));
    }

    @Override // y00.j0
    public final byte[] v(String str, u uVar) {
        com.google.android.gms.common.internal.i0.e(str);
        com.google.android.gms.common.internal.i0.h(uVar);
        J(str, true);
        l4 l4Var = this.f45249g;
        u0 u0Var = l4Var.b().f45266n;
        n1 n1Var = l4Var.l;
        r0 r0Var = n1Var.f44991j;
        String str2 = uVar.f45195a;
        u0Var.b(r0Var.a(str2), "Log and bundle. event");
        l4Var.c().getClass();
        long jNanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) l4Var.d().x(new c9.f(this, uVar, str)).get();
            if (bArr == null) {
                l4Var.b().f45260g.b(w0.x(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            l4Var.c().getClass();
            l4Var.b().f45266n.d("Log and bundle processed. event, size, time_ms", n1Var.f44991j.a(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException e5) {
            e = e5;
            l4Var.b().f45260g.d("Failed to log and bundle. appId, event, error", w0.x(str), n1Var.f44991j.a(str2), e);
            return null;
        } catch (ExecutionException e11) {
            e = e11;
            l4Var.b().f45260g.d("Failed to log and bundle. appId, event, error", w0.x(str), n1Var.f44991j.a(str2), e);
            return null;
        }
    }

    @Override // y00.j0
    public final void w(o4 o4Var, t4 t4Var) {
        com.google.android.gms.common.internal.i0.h(o4Var);
        C(t4Var);
        K(new ye(9, this, o4Var, t4Var, false));
    }

    @Override // y00.j0
    public final void x(t4 t4Var) {
        com.google.android.gms.common.internal.i0.e(t4Var.f45170a);
        com.google.android.gms.common.internal.i0.h(t4Var.f45187s);
        b(new q1(this, t4Var, 2));
    }

    @Override // y00.j0
    public final List y(String str, String str2, t4 t4Var) {
        C(t4Var);
        String str3 = t4Var.f45170a;
        com.google.android.gms.common.internal.i0.h(str3);
        l4 l4Var = this.f45249g;
        try {
            return (List) l4Var.d().w(new s1(this, str3, str, str2, 2)).get();
        } catch (InterruptedException | ExecutionException e5) {
            l4Var.b().f45260g.b(e5, "Failed to get conditional user properties");
            return Collections.EMPTY_LIST;
        }
    }
}
