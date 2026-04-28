package ax;

import android.hardware.camera2.CameraExtensionSession;
import android.util.Log;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.text.Charsets;
import org.bouncycastle.iana.AEADAlgorithm;
import org.json.JSONArray;
import org.json.JSONException;
import zw.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class y implements tx.q, ty.e, u30.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5028a;

    public /* synthetic */ y(c50.l lVar) {
        this.f5028a = 27;
    }

    public static /* bridge */ /* synthetic */ Class c() {
        return CameraExtensionSession.class;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void d(Object obj, int i11, String str) {
        throw new IllegalStateException((str + obj + ((char) i11)).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tx.q
    public void a(boolean z11) {
        HashSet hashSet;
        HashSet hashSetE;
        Object[] objArr = 0;
        switch (this.f5028a) {
            case 0:
                a0 a0Var = a0.f4849a;
                if (z11 && s0.c()) {
                    tx.w.a(new qc.y(24), tx.t.CrashReport);
                    tx.w.a(new qc.y(25), tx.t.ErrorReport);
                    tx.w.a(new qc.y(26), tx.t.AnrReport);
                    break;
                }
                break;
            case 1:
                a0 a0Var2 = a0.f4849a;
                if (z11 && !yx.a.f46339a.contains(bx.o.class)) {
                    try {
                        tx.c0.f40501e.add(new bx.n());
                        tx.c0.d();
                    } catch (Throwable th2) {
                        yx.a.a(bx.o.class, th2);
                        return;
                    }
                    break;
                }
                break;
            case 2:
                if (!z11) {
                    a0 a0Var3 = a0.f4849a;
                } else {
                    a0.f4861n = true;
                }
                break;
            case 3:
                if (!z11) {
                    a0 a0Var4 = a0.f4849a;
                } else {
                    a0.f4862o = true;
                }
                break;
            case 4:
                if (!z11) {
                    a0 a0Var5 = a0.f4849a;
                } else {
                    a0.f4863p = true;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            default:
                if (z11) {
                    gx.b bVar = gx.b.f20911a;
                    if (!yx.a.f46339a.contains(gx.b.class)) {
                        try {
                            gx.b.f20912b = true;
                            gx.b.f20911a.a();
                        } catch (Throwable th3) {
                            yx.a.a(gx.b.class, th3);
                        }
                        break;
                    }
                }
                break;
            case 10:
                if (z11 && !yx.a.f46339a.contains(cx.a.class)) {
                    try {
                        try {
                            a0.c().execute(new bx.c(9));
                        } catch (Exception unused) {
                            a0 a0Var6 = a0.f4849a;
                            return;
                        }
                    } catch (Throwable th4) {
                        yx.a.a(cx.a.class, th4);
                        return;
                    }
                    break;
                }
                break;
            case 11:
                if (z11) {
                    mx.a aVar = mx.a.f30231a;
                    Set set = yx.a.f46339a;
                    if (!set.contains(mx.a.class)) {
                        try {
                            if (!mx.a.f30232b) {
                                mx.a aVar2 = mx.a.f30231a;
                                if (!set.contains(aVar2)) {
                                    try {
                                        tx.z zVarK = tx.c0.k(a0.b(), false);
                                        if (zVarK != null) {
                                            JSONArray jSONArray = zVarK.f40602u;
                                            HashSet hashSet2 = null;
                                            if (!set.contains(aVar2)) {
                                                try {
                                                    try {
                                                        hashSet = tx.n0.e(jSONArray);
                                                        if (hashSet == null) {
                                                            hashSet = new HashSet();
                                                        }
                                                    } catch (Exception unused2) {
                                                        hashSet = new HashSet();
                                                    }
                                                    hashSet2 = hashSet;
                                                } catch (Throwable th5) {
                                                    yx.a.a(aVar2, th5);
                                                }
                                            }
                                            mx.a.f30233c = hashSet2;
                                            break;
                                        }
                                    } catch (Throwable th6) {
                                        yx.a.a(aVar2, th6);
                                    }
                                }
                                mx.a.f30232b = !mx.a.f30233c.isEmpty();
                            }
                        } catch (Throwable th7) {
                            yx.a.a(mx.a.class, th7);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 12:
                if (z11) {
                    lx.q qVar = lx.q.f28410a;
                    if (!yx.a.f46339a.contains(lx.q.class)) {
                        try {
                            if (nx.j.c()) {
                                lx.q.f28414e.set(true);
                                lx.q.d();
                            } else {
                                lx.o.l();
                            }
                        } catch (Throwable th8) {
                            yx.a.a(lx.q.class, th8);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 13:
                if (z11) {
                    mx.i iVar = mx.i.f30256a;
                    Set set2 = yx.a.f46339a;
                    if (!set2.contains(mx.i.class)) {
                        try {
                            if (!mx.i.f30257b) {
                                mx.i iVar2 = mx.i.f30256a;
                                if (!set2.contains(iVar2)) {
                                    try {
                                        tx.z zVarK2 = tx.c0.k(a0.b(), false);
                                        if (zVarK2 != null) {
                                            iVar2.a(zVarK2.f40601t);
                                            break;
                                        }
                                    } catch (Throwable th9) {
                                        yx.a.a(iVar2, th9);
                                    }
                                }
                                mx.i.f30257b = (mx.i.f30258c.isEmpty() && mx.i.f30259d.isEmpty()) ? false : true;
                            }
                        } catch (Throwable th10) {
                            yx.a.a(mx.i.class, th10);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 14:
                if (z11) {
                    mx.f fVar = mx.f.f30245a;
                    if (!yx.a.f46339a.contains(mx.f.class)) {
                        try {
                            mx.f.f30246b = true;
                            mx.f.f30245a.a();
                        } catch (Throwable th11) {
                            yx.a.a(mx.f.class, th11);
                            return;
                        }
                        break;
                    }
                }
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                if (z11) {
                    Set set3 = yx.a.f46339a;
                    if (!set3.contains(mx.d.class)) {
                        try {
                            mx.d dVar = mx.d.f30240a;
                            if (!set3.contains(dVar)) {
                                try {
                                    tx.z zVarK3 = tx.c0.k(a0.b(), false);
                                    if (zVarK3 != null) {
                                        mx.d.f30242c = zVarK3.f40597p;
                                        break;
                                    }
                                } catch (Throwable th12) {
                                    yx.a.a(dVar, th12);
                                }
                            }
                            if (mx.d.f30242c != null) {
                                mx.d.f30241b = true;
                            }
                        } catch (Throwable th13) {
                            yx.a.a(mx.d.class, th13);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 16:
                if (z11) {
                    mx.b bVar2 = mx.b.f30234a;
                    Set set4 = yx.a.f46339a;
                    if (!set4.contains(mx.b.class)) {
                        try {
                            mx.b bVar3 = mx.b.f30234a;
                            if (!set4.contains(bVar3)) {
                                try {
                                    tx.z zVarK4 = tx.c0.k(a0.b(), false);
                                    if (zVarK4 != null && (hashSetE = tx.n0.e(zVarK4.f40598q)) != null) {
                                        mx.b.f30236c = hashSetE;
                                    }
                                } catch (Throwable th14) {
                                    yx.a.a(bVar3, th14);
                                }
                            }
                            HashSet hashSet3 = mx.b.f30236c;
                            if (hashSet3 != null && !hashSet3.isEmpty()) {
                                mx.b.f30235b = true;
                            }
                        } catch (Throwable th15) {
                            yx.a.a(mx.b.class, th15);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 17:
                if (z11) {
                    mx.g gVar = mx.g.f30249a;
                    if (!yx.a.f46339a.contains(mx.g.class)) {
                        try {
                            mx.g.f30249a.a();
                            if (!mx.g.f30251c.isEmpty()) {
                                mx.g.f30250b = true;
                            }
                        } catch (Throwable th16) {
                            yx.a.a(mx.g.class, th16);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 18:
                if (z11) {
                    mx.h hVar = mx.h.f30252a;
                    if (!yx.a.f46339a.contains(mx.h.class)) {
                        try {
                            mx.h.f30252a.a();
                            if (mx.h.f30254c.isEmpty() && mx.h.f30255d.isEmpty()) {
                                mx.h.f30253b = false;
                            } else {
                                mx.h.f30253b = true;
                            }
                        } catch (Throwable th17) {
                            yx.a.a(mx.h.class, th17);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 19:
                if (z11) {
                    try {
                        h0 h0Var = new h0(null, a0.b().concat("/cloudbridge_settings"), null, l0.GET, new dx.e(objArr == true ? 1 : 0));
                        l50.a aVar3 = tx.f0.f40508d;
                        l50.a.A(m0.APP_EVENTS, "dx.f", " \n\nCreating Graph Request: \n=============\n%s\n\n ", h0Var);
                        h0Var.d();
                    } catch (JSONException e5) {
                        l50.a aVar4 = tx.f0.f40508d;
                        l50.a.A(m0.APP_EVENTS, "dx.f", " \n\nGraph Request Exception: \n=============\n%s\n\n ", u70.e.b(e5));
                        return;
                    }
                }
                break;
            case 20:
                if (z11) {
                    ix.c cVar = ix.c.f24233a;
                    if (!yx.a.f46339a.contains(ix.c.class)) {
                        try {
                            ix.c.f24235c = true;
                            ix.c.f24236d = new hx.a(a0.a());
                            ix.c.f24237e = "https://www." + a0.f4866s + "/privacy_sandbox/mobile/register/trigger";
                        } catch (Throwable th18) {
                            yx.a.a(ix.c.class, th18);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 21:
                if (z11) {
                    jx.a.a();
                }
                break;
            case 22:
                if (z11) {
                    AtomicBoolean atomicBoolean = kx.b.f26681a;
                    if (!yx.a.f46339a.contains(kx.b.class)) {
                        try {
                            kx.b.f26681a.set(true);
                        } catch (Throwable th19) {
                            yx.a.a(kx.b.class, th19);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 23:
                if (z11) {
                    qx.b bVar4 = qx.b.f37299a;
                    if (!yx.a.f46339a.contains(qx.b.class)) {
                        try {
                            qx.b.f37300b = true;
                            qx.b.f37299a.b();
                        } catch (Throwable th20) {
                            yx.a.a(qx.b.class, th20);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 24:
                if (z11) {
                    ox.g gVar2 = ox.g.f33790a;
                    if (!yx.a.f46339a.contains(ox.g.class)) {
                        try {
                            try {
                                a0.c().execute(new bx.c(15));
                            } catch (Exception unused3) {
                                return;
                            }
                        } catch (Throwable th21) {
                            yx.a.a(ox.g.class, th21);
                            return;
                        }
                        break;
                    }
                }
                break;
        }
    }

    @Override // ty.e
    public Object apply(Object obj) {
        c50.r0 r0Var = (c50.r0) obj;
        String strE = c50.s0.f7624b.e(r0Var);
        strE.getClass();
        Log.d("FirebaseSessions", "Session Event Type: " + r0Var.f7617a.name());
        byte[] bytes = strE.getBytes(Charsets.UTF_8);
        bytes.getClass();
        return bytes;
    }

    @Override // u30.e
    public Object i(q2 q2Var) {
        return FirebaseSessionsRegistrar.getComponents$lambda$0(q2Var);
    }

    public /* synthetic */ y(int i11) {
        this.f5028a = i11;
    }
}
