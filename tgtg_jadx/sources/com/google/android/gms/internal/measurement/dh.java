package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzd' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class dh {
    public static final dh zza;
    public static final dh zzb;
    public static final dh zzc;
    public static final dh zzd;
    public static final dh zze;
    public static final dh zzf;
    public static final dh zzg;
    public static final dh zzh;
    public static final dh zzi;
    public static final dh zzj;
    private static final dh[] zzk;
    private static final /* synthetic */ dh[] zzp;
    private final char zzl;
    private final fh zzm;
    private final int zzn;
    private final String zzo;

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:506)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:509)
        */
    static {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.dh.<clinit>():void");
    }

    public dh(String str, int i11, char c3, fh fhVar, String str2, boolean z11) {
        this.zzl = c3;
        this.zzm = fhVar;
        eh ehVar = eh.f11395e;
        int i12 = true != z11 ? 0 : 128;
        for (int i13 = 0; i13 < str2.length(); i13++) {
            int iCharAt = ((int) ((eh.f11394d >>> ((str2.charAt(i13) - ' ') * 3)) & 7)) - 1;
            if (iCharAt < 0) {
                i4.a.f("invalid flags: ".concat(str2));
                throw null;
            }
            i12 |= 1 << iCharAt;
        }
        this.zzn = i12;
        this.zzo = w2.l1.f(new StringBuilder(String.valueOf(c3).length() + 1), "%", c3);
    }

    public static dh a(char c3) {
        dh dhVar = zzk[(c3 | ' ') - 97];
        if ((c3 & ' ') != 0) {
            return dhVar;
        }
        if (dhVar == null || (dhVar.zzn & 128) == 0) {
            return null;
        }
        return dhVar;
    }

    public static dh[] values() {
        return (dh[]) zzp.clone();
    }

    public final char c() {
        return this.zzl;
    }

    public final fh d() {
        return this.zzm;
    }

    public final int e() {
        return this.zzn;
    }

    public final String f() {
        return this.zzo;
    }
}
