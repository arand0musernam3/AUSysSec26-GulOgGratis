package zendesk.conversationkit.android;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z70.c;
import z70.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0011"}, d2 = {"Lzendesk/conversationkit/android/ConversationKitFactory;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lzendesk/conversationkit/android/ConversationKitSettings;", "settings", "Lzendesk/conversationkit/android/model/Config;", "config", "Lv80/b0;", "coroutineScope", "Lzendesk/conversationkit/android/ConversationKit;", "create", "(Lzendesk/conversationkit/android/ConversationKitSettings;Lzendesk/conversationkit/android/model/Config;Lv80/b0;Lx70/c;)Ljava/lang/Object;", "Landroid/content/Context;", "Companion", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConversationKitFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: zendesk.conversationkit.android.ConversationKitFactory$create$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.ConversationKitFactory", f = "ConversationKitFactory.kt", l = {62, 63}, m = "create")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
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
            return ConversationKitFactory.this.create(null, null, null, this);
        }
    }

    private ConversationKitFactory(Context context) {
        this.context = context;
    }

    @NotNull
    public static final ConversationKitFactory from(@NotNull Context context) {
        return INSTANCE.from(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
    
        if (r7.dispatch(r9, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object create(@org.jetbrains.annotations.NotNull zendesk.conversationkit.android.ConversationKitSettings r7, @org.jetbrains.annotations.NotNull zendesk.conversationkit.android.model.Config r8, @org.jetbrains.annotations.NotNull v80.b0 r9, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.ConversationKit> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof zendesk.conversationkit.android.ConversationKitFactory.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r10
            zendesk.conversationkit.android.ConversationKitFactory$create$1 r0 = (zendesk.conversationkit.android.ConversationKitFactory.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.ConversationKitFactory$create$1 r0 = new zendesk.conversationkit.android.ConversationKitFactory$create$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2e
            java.lang.Object r7 = r0.L$0
            zendesk.conversationkit.android.internal.ConversationKitStore r7 = (zendesk.conversationkit.android.internal.ConversationKitStore) r7
            ba0.g.M(r10)
            goto L79
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L35:
            java.lang.Object r7 = r0.L$1
            zendesk.conversationkit.android.internal.ConversationKitStore r7 = (zendesk.conversationkit.android.internal.ConversationKitStore) r7
            java.lang.Object r8 = r0.L$0
            zendesk.conversationkit.android.ConversationKitSettings r8 = (zendesk.conversationkit.android.ConversationKitSettings) r8
            ba0.g.M(r10)
            goto L62
        L41:
            ba0.g.M(r10)
            zendesk.conversationkit.android.internal.Environment$Companion r10 = zendesk.conversationkit.android.internal.Environment.INSTANCE
            android.content.Context r2 = r6.context
            zendesk.conversationkit.android.internal.Environment r8 = r10.main(r2, r8, r7, r9)
            zendesk.conversationkit.android.internal.ConversationKitStore r8 = r8.createConversationKitStore()
            zendesk.conversationkit.android.internal.Action$CheckForPersistedUser r9 = zendesk.conversationkit.android.internal.Action.CheckForPersistedUser.INSTANCE
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r9 = r8.dispatch(r9, r0)
            if (r9 != r1) goto L5f
            goto L78
        L5f:
            r5 = r8
            r8 = r7
            r7 = r5
        L62:
            zendesk.conversationkit.android.internal.Action$PushCacheIntegrationId r9 = new zendesk.conversationkit.android.internal.Action$PushCacheIntegrationId
            java.lang.String r8 = r8.getIntegrationId()
            r9.<init>(r8)
            r0.L$0 = r7
            r8 = 0
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r8 = r7.dispatch(r9, r0)
            if (r8 != r1) goto L79
        L78:
            return r1
        L79:
            zendesk.conversationkit.android.DefaultConversationKit r8 = new zendesk.conversationkit.android.DefaultConversationKit
            zendesk.conversationkit.android.internal.metadata.DefaultConversationMetadataService r9 = new zendesk.conversationkit.android.internal.metadata.DefaultConversationMetadataService
            r9.<init>(r7)
            r8.<init>(r7, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.ConversationKitFactory.create(zendesk.conversationkit.android.ConversationKitSettings, zendesk.conversationkit.android.model.Config, v80.b0, x70.c):java.lang.Object");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lzendesk/conversationkit/android/ConversationKitFactory$Companion;", "", "<init>", "()V", "from", "Lzendesk/conversationkit/android/ConversationKitFactory;", "context", "Landroid/content/Context;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ConversationKitFactory from(@NotNull Context context) {
            context.getClass();
            return new ConversationKitFactory(context, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ ConversationKitFactory(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }
}
