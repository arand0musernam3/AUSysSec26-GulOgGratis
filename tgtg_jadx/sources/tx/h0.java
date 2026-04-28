package tx;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f40515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f40516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f40517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Integer[] f40518d;

    static {
        h0 h0Var = new h0();
        f40515a = h0Var;
        f40516b = h0Var.a();
        ArrayList arrayList = null;
        if (!yx.a.f46339a.contains(h0Var)) {
            try {
                ArrayList arrayListD = kotlin.collections.d0.d(new g0(0));
                arrayListD.addAll(h0Var.a());
                arrayList = arrayListD;
            } catch (Throwable th2) {
                yx.a.a(h0Var, th2);
            }
        }
        h0 h0Var2 = f40515a;
        if (!yx.a.f46339a.contains(h0Var2)) {
            try {
                HashMap map = new HashMap();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new g0(3));
                ArrayList arrayList3 = f40516b;
                map.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", arrayList3);
                map.put("com.facebook.platform.action.request.FEED_DIALOG", arrayList3);
                map.put("com.facebook.platform.action.request.LIKE_DIALOG", arrayList3);
                map.put("com.facebook.platform.action.request.APPINVITES_DIALOG", arrayList3);
                map.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList2);
                map.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList2);
                map.put("com.facebook.platform.action.request.CAMERA_EFFECT", arrayList);
                map.put("com.facebook.platform.action.request.SHARE_STORY", arrayList3);
            } catch (Throwable th3) {
                yx.a.a(h0Var2, th3);
            }
        }
        f40517c = new AtomicBoolean(false);
        f40518d = new Integer[]{20210906, 20171115, 20170417, 20170411, 20170213, 20161017, 20160327, 20150702, 20150401, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140313, 20140204, 20131107, 20131024, 20130618, 20130502, 20121101};
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if ((r3 % 2) != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        return java.lang.Math.min(r4, r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int b(java.util.TreeSet r8, int r9, int[] r10) {
        /*
            java.util.Set r0 = yx.a.f46339a
            java.lang.Class<tx.h0> r1 = tx.h0.class
            boolean r0 = r0.contains(r1)
            r2 = 0
            if (r0 == 0) goto Lc
            return r2
        Lc:
            r0 = -1
            if (r8 != 0) goto L10
            goto L52
        L10:
            int r3 = r10.length     // Catch: java.lang.Throwable -> L3c
            int r3 = r3 + (-1)
            java.util.Iterator r8 = r8.descendingIterator()     // Catch: java.lang.Throwable -> L3c
            r4 = r0
        L18:
            boolean r5 = r8.hasNext()     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L52
            java.lang.Object r5 = r8.next()     // Catch: java.lang.Throwable -> L3c
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> L3c
            r5.getClass()     // Catch: java.lang.Throwable -> L3c
            int r6 = r5.intValue()     // Catch: java.lang.Throwable -> L3c
            int r4 = java.lang.Math.max(r4, r6)     // Catch: java.lang.Throwable -> L3c
        L2f:
            if (r3 < 0) goto L3e
            r6 = r10[r3]     // Catch: java.lang.Throwable -> L3c
            int r7 = r5.intValue()     // Catch: java.lang.Throwable -> L3c
            if (r6 <= r7) goto L3e
            int r3 = r3 + (-1)
            goto L2f
        L3c:
            r8 = move-exception
            goto L53
        L3e:
            if (r3 >= 0) goto L41
            goto L52
        L41:
            r6 = r10[r3]     // Catch: java.lang.Throwable -> L3c
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> L3c
            if (r6 != r5) goto L18
            int r3 = r3 % 2
            if (r3 != 0) goto L52
            int r8 = java.lang.Math.min(r4, r9)     // Catch: java.lang.Throwable -> L3c
            return r8
        L52:
            return r0
        L53:
            yx.a.a(r1, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tx.h0.b(java.util.TreeSet, int, int[]):int");
    }

    public static final Intent d(Context context) {
        if (!yx.a.f46339a.contains(h0.class)) {
            try {
                context.getClass();
                Iterator it = f40516b.iterator();
                while (it.hasNext()) {
                    Intent intentAddCategory = new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(((g0) it.next()).b()).addCategory("android.intent.category.DEFAULT");
                    if (yx.a.f46339a.contains(h0.class) || intentAddCategory == null) {
                        intentAddCategory = null;
                    } else {
                        try {
                            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intentAddCategory, 0);
                            if (resolveInfoResolveService != null) {
                                String str = resolveInfoResolveService.serviceInfo.packageName;
                                str.getClass();
                                if (!o.a(context, str)) {
                                }
                            }
                        } catch (Throwable th2) {
                            yx.a.a(h0.class, th2);
                        }
                        intentAddCategory = null;
                    }
                    if (intentAddCategory != null) {
                        return intentAddCategory;
                    }
                }
            } catch (Throwable th3) {
                yx.a.a(h0.class, th3);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004b A[Catch: all -> 0x0096, TryCatch #1 {all -> 0x0096, blocks: (B:5:0x000c, B:26:0x004b, B:28:0x0067, B:37:0x0092, B:36:0x008e, B:40:0x0098, B:42:0x009d, B:23:0x0044, B:9:0x001b, B:11:0x0025, B:13:0x002b, B:19:0x003c, B:21:0x0041, B:17:0x0034, B:31:0x0073, B:33:0x0085), top: B:47:0x000c, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.content.Intent e(android.content.Intent r8, android.os.Bundle r9, com.facebook.FacebookException r10) {
        /*
            java.util.Set r0 = yx.a.f46339a
            java.lang.Class<tx.h0> r1 = tx.h0.class
            boolean r2 = r0.contains(r1)
            r3 = 0
            if (r2 == 0) goto Lc
            goto L4a
        Lc:
            r8.getClass()     // Catch: java.lang.Throwable -> L96
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Throwable -> L96
            java.lang.String r2 = "action_id"
            java.lang.String r4 = "com.facebook.platform.protocol.BRIDGE_ARGS"
            if (r0 == 0) goto L1b
        L19:
            r0 = r3
            goto L48
        L1b:
            int r0 = j(r8)     // Catch: java.lang.Throwable -> L30
            boolean r0 = k(r0)     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L34
            android.os.Bundle r0 = r8.getBundleExtra(r4)     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L32
            java.lang.String r0 = r0.getString(r2)     // Catch: java.lang.Throwable -> L30
            goto L3a
        L30:
            r0 = move-exception
            goto L44
        L32:
            r0 = r3
            goto L3a
        L34:
            java.lang.String r0 = "com.facebook.platform.protocol.CALL_ID"
            java.lang.String r0 = r8.getStringExtra(r0)     // Catch: java.lang.Throwable -> L30
        L3a:
            if (r0 == 0) goto L19
            java.util.UUID r0 = java.util.UUID.fromString(r0)     // Catch: java.lang.Throwable -> L30 java.lang.IllegalArgumentException -> L41
            goto L48
        L41:
            ax.a0 r0 = ax.a0.f4849a     // Catch: java.lang.Throwable -> L30
            goto L19
        L44:
            yx.a.a(r1, r0)     // Catch: java.lang.Throwable -> L96
            goto L19
        L48:
            if (r0 != 0) goto L4b
        L4a:
            return r3
        L4b:
            android.content.Intent r5 = new android.content.Intent     // Catch: java.lang.Throwable -> L96
            r5.<init>()     // Catch: java.lang.Throwable -> L96
            java.lang.String r6 = "com.facebook.platform.protocol.PROTOCOL_VERSION"
            int r8 = j(r8)     // Catch: java.lang.Throwable -> L96
            r5.putExtra(r6, r8)     // Catch: java.lang.Throwable -> L96
            android.os.Bundle r8 = new android.os.Bundle     // Catch: java.lang.Throwable -> L96
            r8.<init>()     // Catch: java.lang.Throwable -> L96
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L96
            r8.putString(r2, r0)     // Catch: java.lang.Throwable -> L96
            if (r10 == 0) goto L98
            java.lang.String r0 = "error"
            java.util.Set r2 = yx.a.f46339a     // Catch: java.lang.Throwable -> L96
            boolean r2 = r2.contains(r1)     // Catch: java.lang.Throwable -> L96
            if (r2 == 0) goto L73
        L71:
            r2 = r3
            goto L92
        L73:
            android.os.Bundle r2 = new android.os.Bundle     // Catch: java.lang.Throwable -> L8d
            r2.<init>()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r6 = "error_description"
            java.lang.String r7 = r10.toString()     // Catch: java.lang.Throwable -> L8d
            r2.putString(r6, r7)     // Catch: java.lang.Throwable -> L8d
            boolean r10 = r10 instanceof com.facebook.FacebookOperationCanceledException     // Catch: java.lang.Throwable -> L8d
            if (r10 == 0) goto L92
            java.lang.String r10 = "error_type"
            java.lang.String r6 = "UserCanceled"
            r2.putString(r10, r6)     // Catch: java.lang.Throwable -> L8d
            goto L92
        L8d:
            r10 = move-exception
            yx.a.a(r1, r10)     // Catch: java.lang.Throwable -> L96
            goto L71
        L92:
            r8.putBundle(r0, r2)     // Catch: java.lang.Throwable -> L96
            goto L98
        L96:
            r8 = move-exception
            goto La3
        L98:
            r5.putExtra(r4, r8)     // Catch: java.lang.Throwable -> L96
            if (r9 == 0) goto La2
            java.lang.String r8 = "com.facebook.platform.protocol.RESULT_ARGS"
            r5.putExtra(r8, r9)     // Catch: java.lang.Throwable -> L96
        La2:
            return r5
        La3:
            yx.a.a(r1, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tx.h0.e(android.content.Intent, android.os.Bundle, com.facebook.FacebookException):android.content.Intent");
    }

    public static final int h() {
        if (yx.a.f46339a.contains(h0.class)) {
            return 0;
        }
        try {
            return f40518d[0].intValue();
        } catch (Throwable th2) {
            yx.a.a(h0.class, th2);
            return 0;
        }
    }

    public static final Bundle i(Intent intent) {
        if (yx.a.f46339a.contains(h0.class)) {
            return null;
        }
        try {
            intent.getClass();
            return !k(j(intent)) ? intent.getExtras() : intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
        } catch (Throwable th2) {
            yx.a.a(h0.class, th2);
            return null;
        }
    }

    public static final int j(Intent intent) {
        if (yx.a.f46339a.contains(h0.class)) {
            return 0;
        }
        try {
            intent.getClass();
            return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        } catch (Throwable th2) {
            yx.a.a(h0.class, th2);
            return 0;
        }
    }

    public static final boolean k(int i11) {
        if (yx.a.f46339a.contains(h0.class)) {
            return false;
        }
        try {
            return kotlin.collections.y.v(f40518d, Integer.valueOf(i11)) && i11 >= 20140701;
        } catch (Throwable th2) {
            yx.a.a(h0.class, th2);
            return false;
        }
    }

    public static final void l() {
        if (yx.a.f46339a.contains(h0.class)) {
            return;
        }
        try {
            if (f40517c.compareAndSet(false, true)) {
                ax.a0.c().execute(new bx.c(22));
            }
        } catch (Throwable th2) {
            yx.a.a(h0.class, th2);
        }
    }

    public final ArrayList a() {
        if (yx.a.f46339a.contains(this)) {
            return null;
        }
        try {
            return kotlin.collections.d0.d(new g0(2), new g0(4));
        } catch (Throwable th2) {
            yx.a.a(this, th2);
            return null;
        }
    }

    public final Intent c(g0 g0Var, String str, Collection collection, String str2, boolean z11, cy.e eVar, String str3, String str4, boolean z12, String str5, boolean z13, cy.f0 f0Var, boolean z14, boolean z15, String str6, String str7, String str8) {
        String str9;
        String strConcat;
        Set set = yx.a.f46339a;
        if (!set.contains(this)) {
            try {
                String str10 = "com.facebook.katana.ProxyAuth";
                switch (g0Var.f40514b) {
                    case 0:
                    case 3:
                        str10 = null;
                        break;
                    case 1:
                        str10 = "com.instagram.platform.AppAuthorizeActivity";
                        break;
                }
                if (str10 != null) {
                    Intent intentPutExtra = new Intent().setClassName(g0Var.b(), str10).putExtra("client_id", str);
                    intentPutExtra.getClass();
                    ax.a0 a0Var = ax.a0.f4849a;
                    intentPutExtra.putExtra("facebook_sdk_version", "18.2.3");
                    if (!(collection == null || collection.isEmpty())) {
                        intentPutExtra.putExtra("scope", TextUtils.join(MessageLogView.COMMA_SEPARATOR, collection));
                    }
                    if (!n0.x(str2)) {
                        intentPutExtra.putExtra("e2e", str2);
                    }
                    intentPutExtra.putExtra("state", str3);
                    switch (g0Var.f40514b) {
                        case 1:
                            str9 = "token,signed_request,graph_domain,granted_scopes";
                            break;
                        default:
                            str9 = "id_token,token,signed_request,graph_domain";
                            break;
                    }
                    intentPutExtra.putExtra("response_type", str9);
                    intentPutExtra.putExtra("nonce", str6);
                    intentPutExtra.putExtra("return_scopes", "true");
                    if (z11) {
                        intentPutExtra.putExtra("default_audience", eVar.a());
                    }
                    intentPutExtra.putExtra("legacy_override", ax.a0.d());
                    intentPutExtra.putExtra("auth_type", str4);
                    if (z12) {
                        intentPutExtra.putExtra("fail_on_logged_out", true);
                    }
                    intentPutExtra.putExtra("messenger_page_id", str5);
                    intentPutExtra.putExtra("reset_messenger_state", z13);
                    if (z14) {
                        intentPutExtra.putExtra("fx_app", f0Var.toString());
                    }
                    if (z15) {
                        intentPutExtra.putExtra("skip_dedupe", true);
                    }
                    if (str7 != null && str7.length() != 0) {
                        intentPutExtra.putExtra("https_redirect_uri", str7);
                        return intentPutExtra;
                    }
                    if (str8 != null && str8.length() != 0) {
                        if (set.contains(this)) {
                            strConcat = null;
                            intentPutExtra.putExtra("intent_uri_package_target", strConcat);
                        } else {
                            try {
                                strConcat = "intent://".concat(str8);
                            } catch (Throwable th2) {
                                yx.a.a(this, th2);
                                strConcat = null;
                            }
                            intentPutExtra.putExtra("intent_uri_package_target", strConcat);
                        }
                    }
                    return intentPutExtra;
                }
            } catch (Throwable th3) {
                yx.a.a(this, th3);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3 A[Catch: all -> 0x00a7, TRY_ENTER, TryCatch #2 {all -> 0x00a7, blocks: (B:5:0x0012, B:45:0x00ac, B:46:0x00af, B:40:0x00a3, B:11:0x004c, B:8:0x002d), top: B:50:0x0012, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0088 A[EXC_TOP_SPLITTER, LOOP:0: B:55:0x0088->B:34:0x008e, LOOP_START, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.TreeSet f(tx.g0 r15) {
        /*
            r14 = this;
            java.lang.String r1 = ".provider.PlatformProvider"
            java.lang.String r2 = "version"
            java.lang.String r3 = "Failed to query content resolver."
            java.lang.String r4 = "tx.h0"
            java.util.Set r0 = yx.a.f46339a
            boolean r5 = r0.contains(r14)
            r6 = 0
            if (r5 == 0) goto L12
            return r6
        L12:
            java.util.TreeSet r5 = new java.util.TreeSet     // Catch: java.lang.Throwable -> La7
            r5.<init>()     // Catch: java.lang.Throwable -> La7
            android.content.Context r7 = ax.a0.a()     // Catch: java.lang.Throwable -> La7
            android.content.ContentResolver r8 = r7.getContentResolver()     // Catch: java.lang.Throwable -> La7
            java.lang.String[] r10 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> La7
            java.lang.String r7 = "content://"
            boolean r0 = r0.contains(r14)     // Catch: java.lang.Throwable -> La7
            if (r0 == 0) goto L2d
        L2b:
            r9 = r6
            goto L50
        L2d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4b
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r7 = r15.b()     // Catch: java.lang.Throwable -> L4b
            r0.append(r7)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r7 = ".provider.PlatformProvider/versions"
            r0.append(r7)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L4b
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch: java.lang.Throwable -> L4b
            r0.getClass()     // Catch: java.lang.Throwable -> L4b
            r9 = r0
            goto L50
        L4b:
            r0 = move-exception
            yx.a.a(r14, r0)     // Catch: java.lang.Throwable -> La7
            goto L2b
        L50:
            android.content.Context r0 = ax.a0.a()     // Catch: java.lang.Throwable -> L66
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L66
            java.lang.String r7 = r15.b()     // Catch: java.lang.Throwable -> L66
            java.lang.String r1 = r7.concat(r1)     // Catch: java.lang.Throwable -> L66
            r7 = 0
            android.content.pm.ProviderInfo r0 = r0.resolveContentProvider(r1, r7)     // Catch: java.lang.Throwable -> L66 java.lang.RuntimeException -> L69
            goto L6e
        L66:
            r0 = move-exception
            r1 = r6
            goto Laa
        L69:
            r0 = move-exception
            android.util.Log.e(r4, r3, r0)     // Catch: java.lang.Throwable -> L66
            r0 = r6
        L6e:
            if (r0 == 0) goto La0
            r12 = 0
            r13 = 0
            r11 = 0
            android.database.Cursor r0 = r8.query(r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L66 java.lang.IllegalArgumentException -> L79 java.lang.SecurityException -> L7e java.lang.NullPointerException -> L82
            r1 = r0
            goto L86
        L79:
            android.util.Log.e(r4, r3)     // Catch: java.lang.Throwable -> L66
        L7c:
            r1 = r6
            goto L86
        L7e:
            android.util.Log.e(r4, r3)     // Catch: java.lang.Throwable -> L66
            goto L7c
        L82:
            android.util.Log.e(r4, r3)     // Catch: java.lang.Throwable -> L66
            goto L7c
        L86:
            if (r1 == 0) goto La1
        L88:
            boolean r0 = r1.moveToNext()     // Catch: java.lang.Throwable -> L9e
            if (r0 == 0) goto La1
            int r0 = r1.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L9e
            int r0 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L9e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L9e
            r5.add(r0)     // Catch: java.lang.Throwable -> L9e
            goto L88
        L9e:
            r0 = move-exception
            goto Laa
        La0:
            r1 = r6
        La1:
            if (r1 == 0) goto La9
            r1.close()     // Catch: java.lang.Throwable -> La7
            goto La9
        La7:
            r0 = move-exception
            goto Lb0
        La9:
            return r5
        Laa:
            if (r1 == 0) goto Laf
            r1.close()     // Catch: java.lang.Throwable -> La7
        Laf:
            throw r0     // Catch: java.lang.Throwable -> La7
        Lb0:
            yx.a.a(r14, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tx.h0.f(tx.g0):java.util.TreeSet");
    }

    public final e10.t g(List list, int[] iArr) {
        if (yx.a.f46339a.contains(this)) {
            return null;
        }
        try {
            l();
            if (list == null) {
                e10.t tVar = new e10.t();
                tVar.f15548a = -1;
                return tVar;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                g0 g0Var = (g0) it.next();
                TreeSet treeSet = g0Var.f40513a;
                if (treeSet == null || treeSet.isEmpty()) {
                    g0Var.a(false);
                }
                int iB = b(g0Var.f40513a, h(), iArr);
                if (iB != -1) {
                    e10.t tVar2 = new e10.t();
                    tVar2.f15548a = iB;
                    return tVar2;
                }
            }
            e10.t tVar3 = new e10.t();
            tVar3.f15548a = -1;
            return tVar3;
        } catch (Throwable th2) {
            yx.a.a(this, th2);
            return null;
        }
    }
}
