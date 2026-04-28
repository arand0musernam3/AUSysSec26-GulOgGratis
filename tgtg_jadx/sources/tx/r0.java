package tx;

import android.app.ProgressDialog;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ImageView;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.google.android.gms.internal.measurement.cg;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r0 extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f40554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Exception[] f40555c = new Exception[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u0 f40556d;

    public r0(u0 u0Var, String str, Bundle bundle) {
        this.f40556d = u0Var;
        this.f40553a = str;
        this.f40554b = bundle;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [tx.q0] */
    public final String[] a(Void... voidArr) {
        if (!yx.a.f46339a.contains(this)) {
            try {
                voidArr.getClass();
                String[] stringArray = this.f40554b.getStringArray("media");
                if (stringArray != null) {
                    final String[] strArr = new String[stringArray.length];
                    this.f40555c = new Exception[stringArray.length];
                    final CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
                    ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                    Date date = ax.b.l;
                    ax.b bVarV = pd.g.v();
                    try {
                        int length = stringArray.length;
                        for (final int i11 = 0; i11 < length; i11++) {
                            if (isCancelled()) {
                                Iterator it = concurrentLinkedQueue.iterator();
                                while (it.hasNext()) {
                                    ((ax.i0) it.next()).cancel(true);
                                }
                            } else {
                                Uri uri = Uri.parse(stringArray[i11]);
                                if (n0.y(uri)) {
                                    strArr[i11] = uri.toString();
                                    countDownLatch.countDown();
                                } else {
                                    ?? r92 = new ax.c0() { // from class: tx.q0
                                        @Override // ax.c0
                                        public final void a(ax.k0 k0Var) {
                                            ax.w wVar;
                                            String str;
                                            String[] strArr2 = strArr;
                                            int i12 = i11;
                                            k0Var.getClass();
                                            try {
                                                wVar = k0Var.f4943c;
                                                str = "Error staging photo.";
                                            } catch (Exception e5) {
                                                this.f40555c[i12] = e5;
                                            }
                                            if (wVar != null) {
                                                String strA = wVar.a();
                                                if (strA != null) {
                                                    str = strA;
                                                }
                                                throw new FacebookGraphResponseException(k0Var, str);
                                            }
                                            JSONObject jSONObject = k0Var.f4942b;
                                            if (jSONObject == null) {
                                                throw new FacebookException("Error staging photo.");
                                            }
                                            String strOptString = jSONObject.optString("uri");
                                            if (strOptString == null) {
                                                throw new FacebookException("Error staging photo.");
                                            }
                                            strArr2[i12] = strOptString;
                                            countDownLatch.countDown();
                                        }
                                    };
                                    uri.getClass();
                                    concurrentLinkedQueue.add(cg.r(bVarV, uri, r92).d());
                                }
                            }
                        }
                        countDownLatch.await();
                        return strArr;
                    } catch (Exception unused) {
                        Iterator it2 = concurrentLinkedQueue.iterator();
                        while (it2.hasNext()) {
                            ((ax.i0) it2.next()).cancel(true);
                        }
                    }
                }
            } catch (Throwable th2) {
                yx.a.a(this, th2);
                return null;
            }
        }
        return null;
    }

    public final void b(String[] strArr) {
        Bundle bundle = this.f40554b;
        u0 u0Var = this.f40556d;
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            ProgressDialog progressDialog = u0Var.f40562e;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            for (Exception exc : this.f40555c) {
                if (exc != null) {
                    u0Var.e(exc);
                    return;
                }
            }
            if (strArr == null) {
                u0Var.e(new FacebookException("Failed to stage photos for web dialog"));
                return;
            }
            List listAsList = Arrays.asList(strArr);
            listAsList.getClass();
            if (listAsList.contains(null)) {
                u0Var.e(new FacebookException("Failed to stage photos for web dialog"));
                return;
            }
            n0.D(bundle, new JSONArray((Collection) listAsList));
            u0Var.f40558a = n0.a(j.d(), ax.a0.d() + "/dialog/" + this.f40553a, bundle).toString();
            ImageView imageView = u0Var.f40563f;
            if (imageView == null) {
                throw new IllegalStateException("Required value was null.");
            }
            u0Var.f((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        if (yx.a.f46339a.contains(this)) {
            return null;
        }
        try {
            return a((Void[]) objArr);
        } catch (Throwable th2) {
            yx.a.a(this, th2);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            b((String[]) obj);
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }
}
