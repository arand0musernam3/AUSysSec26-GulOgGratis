package wy;

import al.u;
import android.content.Context;
import com.braze.h2;
import com.google.firebase.messaging.a0;
import j4.s;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile j f43588e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fz.a f43589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fz.a f43590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bz.a f43591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cz.j f43592d;

    public p(fz.a aVar, fz.a aVar2, bz.a aVar3, cz.j jVar, a0 a0Var) {
        this.f43589a = aVar;
        this.f43590b = aVar2;
        this.f43591c = aVar3;
        this.f43592d = jVar;
        ((Executor) a0Var.f12779b).execute(new u(a0Var, 28));
    }

    public static p a() {
        j jVar = f43588e;
        if (jVar != null) {
            return (p) jVar.f43579f.get();
        }
        h2.b("Not initialized!");
        return null;
    }

    public static void b(Context context) {
        if (f43588e == null) {
            synchronized (p.class) {
                try {
                    if (f43588e == null) {
                        ky.b bVar = new ky.b();
                        context.getClass();
                        bVar.f26684a = context;
                        f43588e = bVar.a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final n c(uy.a aVar) {
        byte[] bytes;
        Set setUnmodifiableSet = aVar instanceof uy.a ? Collections.unmodifiableSet(uy.a.f41569d) : Collections.singleton(new ty.c("proto"));
        t5.a aVarA = i.a();
        aVar.getClass();
        aVarA.f39791b = "cct";
        String str = aVar.f41572a;
        String str2 = aVar.f41573b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = s.k("1$", str, "\\", str2).getBytes(Charset.forName(ArticleContentView.UTF_8_ENCODING_TYPE));
        }
        aVarA.f39792c = bytes;
        return new n(setUnmodifiableSet, aVarA.f(), this);
    }
}
