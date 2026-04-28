package zendesk.messaging.android.push.internal;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.content.Context;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.app.y0;
import com.braze.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.o0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import n90.c;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z70.e;
import zendesk.logger.Logger;
import zendesk.messaging.android.internal.UnreadMessageCounter;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\b\u0004\b\u0000\u0018\u0000 .2\u00020\u0001:\u0001.B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J2\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J0\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016JX\u0010!\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u001c\u001a\u00020\u001b2\u0018\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001dH\u0087@¢\u0006\u0004\b!\u0010\"JW\u0010'\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u001c\u001a\u00020\u001b2\u0014\b\u0002\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0017H\u0007¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000e0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lzendesk/messaging/android/push/internal/NotificationProcessor;", "", "Lzendesk/messaging/android/internal/UnreadMessageCounter;", "unreadMessageCounter", "Ln90/c;", "json", "<init>", "(Lzendesk/messaging/android/internal/UnreadMessageCounter;Ln90/c;)V", "Landroid/content/Context;", "context", "", "authorId", "authorName", "avatarUrl", "Landroidx/core/app/y0;", "createPerson", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", Constants.BRAZE_WEBVIEW_URL_EXTRA, "Lcd/c;", "imageTransformation", "Landroid/graphics/Bitmap;", "loadBitmapImage", "(Landroid/content/Context;Ljava/lang/String;Lcd/c;Lx70/c;)Ljava/lang/Object;", "", "messageData", "Lzendesk/messaging/android/push/internal/NotificationBuilder;", "notificationBuilder", "", "smallIconId", "Lkotlin/Function2;", "", "", "onNotificationDisplayed", "displayPushNotification", "(Landroid/content/Context;Ljava/util/Map;Lzendesk/messaging/android/push/internal/NotificationBuilder;ILkotlin/jvm/functions/Function2;Lx70/c;)Ljava/lang/Object;", "notificationId", MessageBundle.TITLE_ENTRY, "body", "intentData", "displayLocalNotification", "(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Lzendesk/messaging/android/push/internal/NotificationBuilder;ILjava/util/Map;)V", "Lzendesk/messaging/android/internal/UnreadMessageCounter;", "Ln90/c;", "", "people", "Ljava/util/Map;", "Companion", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNotificationProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationProcessor.kt\nzendesk/messaging/android/push/internal/NotificationProcessor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,229:1\n1#2:230\n222#3:231\n*S KotlinDebug\n*F\n+ 1 NotificationProcessor.kt\nzendesk/messaging/android/push/internal/NotificationProcessor\n*L\n63#1:231\n*E\n"})
public final class NotificationProcessor {

    @NotNull
    private static final String LOG_TAG = "NotificationProcessor";

    @NotNull
    private final c json;

    @NotNull
    private final Map<Integer, y0> people;

    @NotNull
    private final UnreadMessageCounter unreadMessageCounter;

    /* JADX INFO: renamed from: zendesk.messaging.android.push.internal.NotificationProcessor$createPerson$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.push.internal.NotificationProcessor", f = "NotificationProcessor.kt", l = {140}, m = "createPerson")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends z70.c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(x70.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NotificationProcessor.this.createPerson(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.push.internal.NotificationProcessor$displayPushNotification$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.push.internal.NotificationProcessor", f = "NotificationProcessor.kt", l = {78}, m = "displayPushNotification")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C04631 extends z70.c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C04631(x70.c<? super C04631> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NotificationProcessor.this.displayPushNotification(null, null, null, 0, null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.push.internal.NotificationProcessor$loadBitmapImage$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.push.internal.NotificationProcessor", f = "NotificationProcessor.kt", l = {174}, m = "loadBitmapImage")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C04641 extends z70.c {
        int label;
        /* synthetic */ Object result;

        public C04641(x70.c<? super C04641> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NotificationProcessor.this.loadBitmapImage(null, null, null, this);
        }
    }

    public NotificationProcessor(@NotNull UnreadMessageCounter unreadMessageCounter, @NotNull c cVar) {
        unreadMessageCounter.getClass();
        cVar.getClass();
        this.unreadMessageCounter = unreadMessageCounter;
        this.json = cVar;
        this.people = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object createPerson(android.content.Context r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, x70.c<? super androidx.core.app.y0> r9) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r9 instanceof zendesk.messaging.android.push.internal.NotificationProcessor.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            zendesk.messaging.android.push.internal.NotificationProcessor$createPerson$1 r0 = (zendesk.messaging.android.push.internal.NotificationProcessor.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.messaging.android.push.internal.NotificationProcessor$createPerson$1 r0 = new zendesk.messaging.android.push.internal.NotificationProcessor$createPerson$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L31
            int r5 = r0.I$0
            java.lang.Object r6 = r0.L$1
            androidx.core.app.x0 r6 = (androidx.core.app.x0) r6
            java.lang.Object r7 = r0.L$0
            androidx.core.app.x0 r7 = (androidx.core.app.x0) r7
            ba0.g.M(r9)
            goto L72
        L31:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L38:
            ba0.g.M(r9)
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r7, r8}
            int r6 = java.util.Objects.hash(r6)
            java.util.Map<java.lang.Integer, androidx.core.app.y0> r9 = r4.people
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r6)
            java.lang.Object r9 = r9.get(r2)
            androidx.core.app.y0 r9 = (androidx.core.app.y0) r9
            if (r9 == 0) goto L53
            return r9
        L53:
            androidx.core.app.x0 r9 = new androidx.core.app.x0
            r9.<init>()
            r9.f2708a = r7
            cd.a r7 = new cd.a
            r7.<init>()
            r0.L$0 = r9
            r0.L$1 = r9
            r0.I$0 = r6
            r0.label = r3
            java.lang.Object r5 = r4.loadBitmapImage(r5, r8, r7, r0)
            if (r5 != r1) goto L6e
            return r1
        L6e:
            r7 = r9
            r9 = r5
            r5 = r6
            r6 = r7
        L72:
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            if (r9 == 0) goto L7c
            androidx.core.graphics.drawable.IconCompat r8 = androidx.core.graphics.drawable.IconCompat.c(r9)
            r6.f2709b = r8
        L7c:
            androidx.core.app.y0 r6 = new androidx.core.app.y0
            r6.<init>()
            java.lang.String r8 = r7.f2708a
            r6.f2711a = r8
            androidx.core.graphics.drawable.IconCompat r7 = r7.f2709b
            r6.f2712b = r7
            r7 = 0
            r6.f2713c = r7
            r6.f2714d = r7
            r7 = 0
            r6.f2715e = r7
            r6.f2716f = r7
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r5)
            java.util.Map<java.lang.Integer, androidx.core.app.y0> r5 = r4.people
            r5.put(r7, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.push.internal.NotificationProcessor.createPerson(android.content.Context, java.lang.String, java.lang.String, java.lang.String, x70.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void displayLocalNotification$default(NotificationProcessor notificationProcessor, Context context, int i11, String str, String str2, NotificationBuilder notificationBuilder, int i12, Map map, int i13, Object obj) {
        Map map2;
        if ((i13 & 64) != 0) {
            o0 o0Var = o0.f26530a;
            o0Var.getClass();
            map2 = o0Var;
        } else {
            map2 = map;
        }
        notificationProcessor.displayLocalNotification(context, i11, str, str2, notificationBuilder, i12, map2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadBitmapImage(android.content.Context r7, java.lang.String r8, cd.c r9, x70.c<? super android.graphics.Bitmap> r10) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r10 instanceof zendesk.messaging.android.push.internal.NotificationProcessor.C04641
            if (r0 == 0) goto L13
            r0 = r10
            zendesk.messaging.android.push.internal.NotificationProcessor$loadBitmapImage$1 r0 = (zendesk.messaging.android.push.internal.NotificationProcessor.C04641) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.messaging.android.push.internal.NotificationProcessor$loadBitmapImage$1 r0 = new zendesk.messaging.android.push.internal.NotificationProcessor$loadBitmapImage$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L2f
            if (r2 != r4) goto L29
            ba0.g.M(r10)
            goto L8f
        L29:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            return r5
        L2f:
            ba0.g.M(r10)
            if (r8 == 0) goto Lc0
            int r10 = r8.length()
            if (r10 != 0) goto L3c
            goto Lc0
        L3c:
            zendesk.ui.android.internal.ImageLoaderFactory r10 = zendesk.ui.android.internal.ImageLoaderFactory.INSTANCE
            pc.d r10 = r10.getImageLoader(r7)
            zc.i r2 = new zc.i
            r2.<init>(r7)
            r2.f47443c = r8
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r2.l = r7
            if (r9 == 0) goto L5d
            cd.c[] r7 = new cd.c[r4]
            r7[r3] = r9
            java.util.List r7 = kotlin.collections.y.T(r7)
            java.util.List r7 = a.a.O(r7)
            r2.f47447g = r7
        L5d:
            zc.k r7 = r2.a()
            r0.label = r4
            pc.h r10 = (pc.h) r10
            r10.getClass()
            bd.b r8 = r7.f47466c
            boolean r8 = r8 instanceof bd.a
            if (r8 == 0) goto L7b
            nk.j r8 = new nk.j
            r9 = 8
            r8.<init>(r7, r10, r5, r9)
            java.lang.Object r7 = v80.f0.n(r8, r0)
        L79:
            r10 = r7
            goto L8c
        L7b:
            c90.f r8 = v80.p0.f42144a
            w80.c r8 = a90.p.f1044a
            w80.c r8 = r8.f43295e
            pc.e r9 = new pc.e
            r2 = 2
            r9.<init>(r10, r7, r5, r2)
            java.lang.Object r7 = v80.f0.K(r8, r9, r0)
            goto L79
        L8c:
            if (r10 != r1) goto L8f
            return r1
        L8f:
            zc.l r10 = (zc.l) r10
            boolean r7 = r10 instanceof zc.r
            if (r7 == 0) goto La3
            zc.r r10 = (zc.r) r10
            android.graphics.drawable.Drawable r7 = r10.f47508a
            r7.getClass()
            android.graphics.drawable.BitmapDrawable r7 = (android.graphics.drawable.BitmapDrawable) r7
            android.graphics.Bitmap r7 = r7.getBitmap()
            return r7
        La3:
            boolean r7 = r10 instanceof zc.f
            if (r7 == 0) goto Lbd
            zc.f r10 = (zc.f) r10
            java.lang.Throwable r7 = r10.f47438c
            java.lang.String r7 = r7.getMessage()
            java.lang.String r8 = "Unable to load avatar image: "
            java.lang.String r7 = e0.f.k(r8, r7)
            java.lang.Object[] r8 = new java.lang.Object[r3]
            java.lang.String r9 = "NotificationProcessor"
            zendesk.logger.Logger.w(r9, r7, r8)
            return r5
        Lbd:
            e40.a.f()
        Lc0:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.push.internal.NotificationProcessor.loadBitmapImage(android.content.Context, java.lang.String, cd.c, x70.c):java.lang.Object");
    }

    public static /* synthetic */ Object loadBitmapImage$default(NotificationProcessor notificationProcessor, Context context, String str, cd.c cVar, x70.c cVar2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            cVar = null;
        }
        return notificationProcessor.loadBitmapImage(context, str, cVar, cVar2);
    }

    @SuppressLint({"MissingPermission"})
    public final void displayLocalNotification(@NotNull Context context, int notificationId, @NotNull String title, @NotNull String body, @NotNull NotificationBuilder notificationBuilder, int smallIconId, @NotNull Map<String, String> intentData) {
        context.getClass();
        title.getClass();
        body.getClass();
        notificationBuilder.getClass();
        intentData.getClass();
        Notification notificationBuild = notificationBuilder.setTitle(title).setMessage(body).setSmallIcon(smallIconId).setCategory("msg").setAutoCancel(true).setOpenProactiveNotificationIntent(notificationId, intentData.get(NotificationBuilder.PROACTIVE_CAMPAIGN_ID)).build();
        NotificationManagerCompat notificationManagerCompatFrom = NotificationManagerCompat.from(context);
        notificationManagerCompatFrom.getClass();
        if (notificationManagerCompatFrom.areNotificationsEnabled()) {
            notificationManagerCompatFrom.notify(notificationId, notificationBuild);
        } else {
            Logger.w(LOG_TAG, "Cannot display notification because the notification permission is not granted", new Object[0]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @android.annotation.SuppressLint({"MissingPermission"})
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object displayPushNotification(@org.jetbrains.annotations.NotNull android.content.Context r18, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> r19, @org.jetbrains.annotations.NotNull zendesk.messaging.android.push.internal.NotificationBuilder r20, int r21, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Double, kotlin.Unit> r22, @org.jetbrains.annotations.NotNull x70.c<? super kotlin.Unit> r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.push.internal.NotificationProcessor.displayPushNotification(android.content.Context, java.util.Map, zendesk.messaging.android.push.internal.NotificationBuilder, int, kotlin.jvm.functions.Function2, x70.c):java.lang.Object");
    }

    public /* synthetic */ NotificationProcessor(UnreadMessageCounter unreadMessageCounter, c cVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? UnreadMessageCounter.INSTANCE : unreadMessageCounter, cVar);
    }
}
