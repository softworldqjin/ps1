select  i.id as 'ID',
        ni.fish_name as 'FISH_NAME',
        i.length as 'LENGTH'
from fish_info i
inner join fish_name_info ni on i.fish_type = ni.fish_type
where (i.fish_type, i.length) in (
                                select fish_type, max(length)
                                from fish_info
                                group by fish_type)
order by i.id asc;
