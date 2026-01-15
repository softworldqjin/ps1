select  year(DIFFERENTIATION_DATE) as 'Year',
        n2.max - n1.SIZE_OF_COLONY as 'YEAR_DEV',
        n1.id as 'ID'
from ECOLI_DATA n1
inner join (
select  year(DIFFERENTIATION_DATE) as 'year',
        max(SIZE_OF_COLONY) as 'max'
from ECOLI_DATA
group by year(DIFFERENTIATION_DATE)
) n2
on year(n1.DIFFERENTIATION_DATE) = n2.year
order by Year asc, YEAR_DEV asc
