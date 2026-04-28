package u40;

import android.text.TextUtils;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.io.IOException;
import java.util.Iterator;
import oz.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f40743b;

    public /* synthetic */ b(d dVar, int i11) {
        this.f40742a = i11;
        this.f40743b = dVar;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        v40.b bVarE;
        v40.b bVarG;
        switch (this.f40742a) {
            case 0:
                this.f40743b.a();
                return;
            case 1:
                this.f40743b.a();
                return;
            default:
                d dVar = this.f40743b;
                Object obj = d.f40746m;
                synchronized (obj) {
                    try {
                        p30.g gVar = dVar.f40747a;
                        gVar.a();
                        m mVarD = m.d(gVar.f34222a);
                        try {
                            bVarE = dVar.f40749c.E();
                            if (mVarD != null) {
                                mVarD.v();
                            }
                        } catch (Throwable th2) {
                            if (mVarD != null) {
                                mVarD.v();
                            }
                            throw th2;
                        }
                    } finally {
                    }
                }
                try {
                    v40.d dVar2 = bVarE.f42007b;
                    v40.d dVar3 = v40.d.REGISTER_ERROR;
                    if (dVar2 == dVar3) {
                        bVarG = dVar.g(bVarE);
                    } else {
                        if (dVar2 == v40.d.UNREGISTERED) {
                            bVarG = dVar.g(bVarE);
                        } else if (!dVar.f40750d.a(bVarE)) {
                            return;
                        } else {
                            bVarG = dVar.b(bVarE);
                        }
                    }
                    synchronized (obj) {
                        try {
                            p30.g gVar2 = dVar.f40747a;
                            gVar2.a();
                            m mVarD2 = m.d(gVar2.f34222a);
                            try {
                                dVar.f40749c.y(bVarG);
                                if (mVarD2 != null) {
                                    mVarD2.v();
                                }
                            } catch (Throwable th3) {
                                if (mVarD2 != null) {
                                    mVarD2.v();
                                }
                                throw th3;
                            }
                        } finally {
                        }
                    }
                    synchronized (dVar) {
                        try {
                            if (dVar.f40757k.size() != 0 && !TextUtils.equals(bVarE.f42006a, bVarG.f42006a)) {
                                Iterator it = dVar.f40757k.iterator();
                                if (it.hasNext()) {
                                    if (it.next() != null) {
                                        throw new ClassCastException();
                                    }
                                    throw null;
                                }
                            }
                        } finally {
                        }
                    }
                    if (bVarG.f42007b == v40.d.REGISTERED) {
                        String str = bVarG.f42006a;
                        synchronized (dVar) {
                            dVar.f40756j = str;
                        }
                    }
                    v40.d dVar4 = bVarG.f42007b;
                    if (dVar4 == dVar3) {
                        dVar.h(new FirebaseInstallationsException());
                        return;
                    } else if (dVar4 == v40.d.NOT_GENERATED || dVar4 == v40.d.ATTEMPT_MIGRATION) {
                        dVar.h(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        dVar.i(bVarG);
                        return;
                    }
                } catch (FirebaseInstallationsException e5) {
                    dVar.h(e5);
                    return;
                }
        }
    }
}
