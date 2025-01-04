addi $t0, $zero, 5       # $t0 = 5 (inicializa $t0 com o valor 5)
add $t9, $t0, $zero      # $t9 = $t0 (copia o valor de $t0 para $t9)
add $t1, $t0, $zero      # $t1 = $t0 (copia o valor de $t0 para $t1)
addi $t5, $zero, 1       # $t5 = 1 (inicializa $t5 com o valor 1)

loop_externo:
    add $t0, $t1, $zero  # $t0 = $t1 (copia o valor de $t1 para $t0)
    addi $t9, $t9, -1    # $t9 = $t9 - 1 (decrementa $t9 por 1)
    add $t8, $t9, $zero  # $t8 = $t9 (copia o valor de $t9 para $t8)
    beq $t9, $t5, end    # Se $t9 == $t5, salta para o label 'end'

loop_interno:
    add $t1, $t1, $t0    # $t1 = $t1 + $t0 (soma o valor de $t0 em $t1)
    addi $t8, $t8, -1    # $t8 = $t8 - 1 (decrementa $t8 por 1)
    beq $t8, $t5, loop_externo  # Se $t8 == $t5, volta para o label 'loop_externo'
    
j loop_interno    # Faz um salto incondicional para 'loop_interno' (cria um loop interno)
end:              # final do programa