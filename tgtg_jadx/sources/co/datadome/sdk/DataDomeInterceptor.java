package co.datadome.sdk;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.lifecycle.n1;
import co.datadome.sdk.DataDomeSDK;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.jvm.internal.StringCompanionObject;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import q90.g0;
import q90.p0;
import q90.r0;
import zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentView;

/* JADX INFO: loaded from: classes.dex */
public class DataDomeInterceptor implements q90.x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static DataDomeSDK.Builder f8630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f8631c = Charset.forName(ArticleContentView.UTF_8_ENCODING_TYPE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static q90.p f8632d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f8633a;

    @Deprecated
    public DataDomeInterceptor(Application application, DataDomeSDKListener dataDomeSDKListener, String str, String str2, Boolean bool) {
        if (f8630b == null) {
            f8630b = DataDomeSDK.with(application, str, str2).bypassAcceptHeader(bool).listener(dataDomeSDKListener);
        }
        this.f8633a = application;
    }

    public Context getContext() {
        return this.f8633a;
    }

    @NotNull
    public q90.p getDataDomeCookieJar(q90.p pVar) {
        f8632d = pVar;
        DataDomeSDK.Builder builder = f8630b;
        n nVar = new n();
        nVar.f8673a = pVar;
        nVar.f8674b = builder;
        return nVar;
    }

    public DataDomeSDK.Builder getDataDomeSDK() {
        return f8630b;
    }

    @Override // q90.x
    @NonNull
    public p0 intercept(@NonNull q90.w wVar) throws EOFException {
        v90.g gVar = (v90.g) wVar;
        g0 g0Var = gVar.f42190e;
        g0Var.getClass();
        q90.t tVar = g0Var.f36507c;
        List listH = tVar.h("Cookie");
        n1 n1VarB = g0Var.b();
        ax.g0 g0Var2 = new ax.g0(3);
        int size = tVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            zz.f.k(g0Var2, tVar.d(i11), tVar.g(i11));
        }
        g0Var2.i("Cookie");
        String strA = DataDomeUtils.a(f8630b.getCookie(), listH);
        if (!strA.equals("datadome=")) {
            g0Var2.e("Cookie", strA);
        }
        q90.t tVarG = g0Var2.g();
        n1VarB.f3501c = tVarG.e();
        v.a("Request cookie: " + tVarG.b("cookie") + "\nFor request " + g0Var.f36505a);
        p0 p0VarB = gVar.b(new g0(n1VarB));
        g0 g0Var3 = p0VarB.f36582a;
        q90.t tVar2 = p0VarB.f36587f;
        if (!tVar2.h("Set-Cookie").isEmpty()) {
            List listH2 = tVar2.h("Set-Cookie");
            if (!listH2.isEmpty()) {
                Iterator it = listH2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String str = (String) it.next();
                    if (DataDomeUtils.isValidCookie(str).booleanValue()) {
                        f8630b.setCookie(str);
                        v.a("Response set-cookie: " + str + "\nFor request " + g0Var3.f36505a);
                        break;
                    }
                }
            }
        }
        u90.n nVar = gVar.f42186a;
        u90.n nVar2 = new u90.n(nVar.f40923a, nVar.f40924b, nVar.f40925c);
        r0 r0Var = p0VarB.f36588g;
        if (r0Var == null) {
            return p0VarB;
        }
        boolean z11 = (DataDomeUtils.isNullOrEmpty(tVar2.b("X-DD-B")).booleanValue() && DataDomeUtils.isNullOrEmpty(tVar2.b("X-SF-CC-X-dd-b")).booleanValue()) ? false : true;
        g0Var3.getClass();
        q90.v vVar = g0Var3.f36505a;
        String strB = g0Var3.f36507c.b("User-Agent");
        HashMap map = new HashMap();
        StringCompanionObject.INSTANCE.getClass();
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        comparator.getClass();
        TreeSet treeSet = new TreeSet(comparator);
        int size2 = tVar2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            treeSet.add(tVar2.d(i12));
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        setUnmodifiableSet.getClass();
        for (String str2 : setUnmodifiableSet) {
            String strB2 = tVar2.b(str2);
            if (strB2 != null) {
                map.put(str2, strB2);
            }
        }
        f8630b.getClass();
        if (q.b(p0VarB).booleanValue()) {
            q90.p pVar = f8632d;
            if (pVar == null) {
                Log.e("DataDome", "Implement the \"CookieJar\" interface to handle SFCC cookies, otherwise DataDome might not work correctly.\n Refer to https://docs.datadome.co/docs/sdk-android#cookiejar-interface-implementation.");
            } else {
                for (q90.o oVar : pVar.c(vVar)) {
                    if (oVar.f36557a.equalsIgnoreCase("dwsid")) {
                        map.put(oVar.f36557a, oVar.f36558b);
                    }
                }
            }
        }
        if (z11) {
            ia0.g gVar2 = new ia0.g();
            ia0.i iVarP0 = r0Var.p0();
            while (iVarP0.F(gVar2, 8192L) != -1) {
            }
            ia0.g gVarClone = gVar2.clone();
            String strB3 = tVar2.b("Content-Encoding");
            if (strB3 != null) {
                if (strB3.equalsIgnoreCase("gzip")) {
                    ia0.r rVar = new ia0.r(gVarClone.clone());
                    try {
                        ia0.g gVar3 = new ia0.g();
                        gVar3.b0(rVar);
                        gVarClone = gVar3.clone();
                        rVar.close();
                    } catch (Throwable th2) {
                        try {
                            rVar.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } else if (strB3.equalsIgnoreCase("br")) {
                    ia0.u uVarG = ia0.b.g(new BrotliInputStream(iVarP0.w0()));
                    ia0.g gVar4 = new ia0.g();
                    gVar4.b0(uVarG);
                    String strG0 = gVar4.g0();
                    uVarG.close();
                    gVar4.a();
                    DataDomeSDK.Builder builderAgent = f8630b.agent(strB);
                    builderAgent.f8691j = vVar.f36631i;
                    return builderAgent.process(p0VarB, map, strG0, nVar2);
                }
            }
            q90.z zVarG = r0Var.g();
            Charset charset = f8631c;
            Charset charsetA = zVarG != null ? zVarG.a(charset) : charset;
            if (charsetA != null) {
                charset = charsetA;
            }
            if (charset != null) {
                String strA0 = gVarClone.a0(gVarClone.f23643b, charset);
                DataDomeSDK.Builder builderAgent2 = f8630b.agent(strB);
                builderAgent2.f8691j = vVar.f36631i;
                return builderAgent2.process(p0VarB, map, strA0, nVar2);
            }
            p0VarB.close();
        }
        DataDomeSDK.Builder builderAgent3 = f8630b.agent(strB);
        builderAgent3.f8691j = vVar.f36631i;
        return builderAgent3.process(p0VarB, map, "", nVar2);
    }

    @Deprecated
    public DataDomeInterceptor(Application application, DataDomeSDKListener dataDomeSDKListener, String str, String str2) {
        if (f8630b == null) {
            f8630b = DataDomeSDK.with(application, str, str2).listener(dataDomeSDKListener);
        }
        this.f8633a = application;
    }

    public DataDomeInterceptor(Application application, DataDomeSDK.Builder builder) {
        f8630b = builder;
        this.f8633a = application;
    }
}
