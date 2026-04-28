package r40;

import android.util.Base64OutputStream;
import b0.x1;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import m90.z0;
import org.json.JSONArray;
import org.json.JSONObject;
import zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f37616b;

    public /* synthetic */ b(c cVar, int i11) {
        this.f37615a = i11;
        this.f37616b = cVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String string;
        int i11 = this.f37615a;
        c cVar = this.f37616b;
        switch (i11) {
            case 0:
                synchronized (cVar) {
                    try {
                        h hVar = (h) cVar.f37617a.get();
                        ArrayList arrayListA = hVar.a();
                        synchronized (hVar) {
                            hVar.f37625a.a(new z0(hVar, 19));
                        }
                        JSONArray jSONArray = new JSONArray();
                        for (int i12 = 0; i12 < arrayListA.size(); i12++) {
                            a aVar = (a) arrayListA.get(i12);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", aVar.f37613a);
                            jSONObject.put("dates", new JSONArray((Collection) aVar.f37614b));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes(ArticleContentView.UTF_8_ENCODING_TYPE));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                string = byteArrayOutputStream.toString(ArticleContentView.UTF_8_ENCODING_TYPE);
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return string;
            default:
                synchronized (cVar) {
                    h hVar2 = (h) cVar.f37617a.get();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String strA = ((a50.b) cVar.f37619c.get()).a();
                    synchronized (hVar2) {
                        String strB = hVar2.b(jCurrentTimeMillis);
                        strA.getClass();
                        hVar2.f37625a.a(new x1(22, hVar2, strB, strA, new h8.e(strA)));
                    }
                }
                return null;
        }
    }
}
